package co.zecko.retailer.client.httpClient;

import co.zecko.retailer.common.enums.HttpStatus;
import co.zecko.retailer.common.pojo.order.OrderData;
import co.zecko.retailer.common.pojo.order.OrdersData;
import co.zecko.retailer.exception.ZeckoException;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static co.zecko.retailer.common.constant.Header.AFTER_HEADER;
import static co.zecko.retailer.common.constant.Header.BEFORE_HEADER;

@FieldDefaults(level = AccessLevel.PACKAGE)
public class OrderClient extends BaseClient {
    static final String BASE_URI = "/retailer/v1/orders";
    final String zeckoAccessToken;
    public OrderClient(String zeckoAccessToken) {
        this.zeckoAccessToken = zeckoAccessToken;
    }
    public OrdersData findAll(String clientCustomerId, String before, String after)
        throws ZeckoException, IOException, InterruptedException {
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);
        Map<String, String> queryParams = new HashMap<>();
        String routeUri = "";
        if (StringUtils.isEmpty(clientCustomerId)) {
            String message = "Missing required parameter clientCustomerId";
            throw new ZeckoException(message, HttpStatus.BAD_REQUEST);
        }

        queryParams.put("customerId", clientCustomerId);
        if (!StringUtils.isEmpty(after)) {
            queryParams.put(AFTER_HEADER, after);
        }

        if (!StringUtils.isEmpty(before)) {
            queryParams.put(BEFORE_HEADER, before);
        }
        String url = getUrl(BASE_URI + routeUri);
        return get(url, queryParams, headers, new TypeReference<>() {});
    }

    public OrderData findByLegacyOrderId(String id, String lineItemsBefore, String lineItemsAfter)
        throws ZeckoException, IOException, InterruptedException {
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);
        Map<String, String> queryParams = new HashMap<>();
        String routeUri = "";

        if (StringUtils.isEmpty(id)) {
            String message = "Missing required parameter orderId";
            throw new ZeckoException(message, HttpStatus.BAD_REQUEST);
        }

        routeUri = String.format("/%s", id);

        if (!StringUtils.isEmpty(lineItemsBefore)) {
            queryParams.put("lineItemsBefore", lineItemsBefore);
        }

        if (!StringUtils.isEmpty(lineItemsAfter)) {
            queryParams.put("lineItemsAfter", lineItemsAfter);
        }

        String url = getUrl(BASE_URI + routeUri);

        return get(url, queryParams, headers, new TypeReference<>() {});
    }
}