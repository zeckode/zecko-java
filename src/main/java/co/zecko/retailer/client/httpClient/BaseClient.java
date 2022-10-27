package co.zecko.retailer.client.httpClient;

import static co.zecko.retailer.common.constant.AppConstant.ZECKO_BASE_URL;
import static co.zecko.retailer.common.constant.Env.ZECKO_ACCESS_TOKEN_ENV;
import static co.zecko.retailer.common.constant.Env.ZECKO_BASE_URL_ENV;
import static co.zecko.retailer.common.constant.Header.ZECKO_ACCESS_TOKEN_HEADER;

import co.zecko.retailer.common.enums.HttpStatus;
import co.zecko.retailer.exception.BaseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpRequest.Builder;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.apache.commons.lang3.StringUtils;

@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class BaseClient {

    static final String ZECKO_CLIENT_THREAD_COUNT = "ZECKO_CLIENT_THREAD_COUNT";
    static final Integer ZECKO_CLIENT_DEFAULT_THREAD_COUNT = 5;
    static Integer threadCount;

    final HttpClient httpClient;

    final ObjectMapper objectMapper;

    public BaseClient() {
        try {
            threadCount = Integer.valueOf(System.getenv(ZECKO_CLIENT_THREAD_COUNT));
        } catch (Exception e) {
            threadCount = ZECKO_CLIENT_DEFAULT_THREAD_COUNT;
        }

        ExecutorService executorService = Executors.newFixedThreadPool(threadCount);
        this.httpClient = HttpClient.newBuilder().executor(executorService).build();
        this.objectMapper = new ObjectMapper();
    }

    public <ResponseBody> ResponseBody get(String url, Map<String, String> queryParams,
        Map<String, String> headers, TypeReference<ResponseBody> responseType)
        throws IOException, InterruptedException {

        String queryAppendedUrl = getQueryAppendedUrl(url, queryParams);
        HttpRequest httpRequest = getBaseRequest(queryAppendedUrl, headers).GET().build();
        return request(httpRequest, responseType);
    }

    // TODO: test without body
    public <RequestBody, ResponseBody> ResponseBody post(String url, RequestBody requestBody,
        Map<String, String> headers, TypeReference<ResponseBody> responseType)
        throws IOException, InterruptedException {

        String requestBodyString = objectMapper.writeValueAsString(requestBody);
        HttpRequest httpRequest = getBaseRequest(url, headers).POST(
            BodyPublishers.ofString(requestBodyString)).build();

        return request(httpRequest, responseType);
    }

    public String getZeckoAccessToken(String zeckoAccessToken) throws BaseException {
        if (StringUtils.isEmpty(zeckoAccessToken)) {
            zeckoAccessToken = System.getenv(ZECKO_ACCESS_TOKEN_HEADER);
        }

        if (StringUtils.isEmpty(zeckoAccessToken)) {
            String message = String.format(
                "Either pass zeckoAccessToken parameter or declare %S environment",
                ZECKO_ACCESS_TOKEN_ENV);

            throw new BaseException(message, HttpStatus.BAD_REQUEST);
        }

        return zeckoAccessToken;
    }

    public Map<String, String> getBaseHeaders(String zeckoAccessToken) {
        Map<String, String> headers = new HashMap<>();
        headers.put(ZECKO_ACCESS_TOKEN_HEADER, zeckoAccessToken);
        return headers;
    }

    protected String getUrl(String uri) {
        return getBaseUrl() + uri;
    }

    private <ResponseBody> ResponseBody request(HttpRequest httpRequest,
        TypeReference<ResponseBody> responseType) throws IOException, InterruptedException {

        String responseString = httpClient.send(httpRequest, BodyHandlers.ofString()).body();
        return objectMapper.readValue(responseString, responseType);
    }

    private Builder getBaseRequest(String url, Map<String, String> headers) {
        URI uri = URI.create(url);
        Builder builder = HttpRequest.newBuilder().uri(uri);

        for (Entry<String, String> headerEntry : headers.entrySet()) {
            builder.setHeader(headerEntry.getKey(), headerEntry.getValue());
        }

        return builder;
    }

    private String getBaseUrl() {
        String envUrl = System.getenv(ZECKO_BASE_URL_ENV);
        return StringUtils.isEmpty(envUrl) ? ZECKO_BASE_URL : envUrl;
    }

    private String getQueryAppendedUrl(String url, Map<String, String> queryParams) {
        String queryString = getQueryString(queryParams);

        if (StringUtils.isEmpty(queryString)) {
            return url;
        }

        String joiner = url.contains("?") ? "&" : "?";
        return url + joiner + queryString;
    }

    private String getQueryString(Map<String, String> queryParams) {
        if (queryParams.isEmpty()) {
            return "";
        }

        List<String> queryComponents = new ArrayList<>();

        for (Entry<String, String> queryParam : queryParams.entrySet()) {
            queryComponents.add(String.format("%s=%s", queryParam.getKey(), queryParam.getValue()));
        }

        return StringUtils.join(queryComponents, "&");
    }
}