package co.zecko.retailer.client.httpClient;

import static co.zecko.retailer.common.constant.Header.AFTER_HEADER;
import static co.zecko.retailer.common.constant.Header.BEFORE_HEADER;

import co.zecko.retailer.common.pojo.collection.CollectionData;
import co.zecko.retailer.common.pojo.collection.CollectionsData;
import co.zecko.retailer.exception.BaseException;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.apache.commons.lang3.StringUtils;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class CollectionClient extends BaseClient {

    static final String BASE_URI = "/retailer/v1/collections";
    String zeckoAccessToken;
    public CollectionClient(String zeckoAccessToken) {
        this.zeckoAccessToken = zeckoAccessToken;
    }

    public CollectionsData findAll(String after, String before)
        throws BaseException, IOException, InterruptedException {

        zeckoAccessToken = getZeckoAccessToken(zeckoAccessToken);
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);
        Map<String, String> queryParams = new HashMap<>();
        String routeUri = "";
        String url = getUrl(BASE_URI + routeUri);

        if (!StringUtils.isEmpty(after)) {
            queryParams.put(AFTER_HEADER, after);
        }

        if (!StringUtils.isEmpty(before)) {
            queryParams.put(BEFORE_HEADER, before);
        }

        return get(url, queryParams, headers, new TypeReference<>() {});
    }

    public CollectionData findById(String id)
        throws BaseException, IOException, InterruptedException{
        zeckoAccessToken = getZeckoAccessToken(zeckoAccessToken);
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);
        Map<String, String> queryParams = new HashMap<>();
        String routeUri = "";

        if (!StringUtils.isEmpty(id)) {
            routeUri += "/" + id;
        }

        String url = getUrl(BASE_URI + routeUri);

        return get(url, queryParams, headers, new TypeReference<>() {});
    }
}
