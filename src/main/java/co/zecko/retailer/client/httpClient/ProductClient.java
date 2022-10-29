package co.zecko.retailer.client.httpClient;

import co.zecko.retailer.common.enums.HttpStatus;
import co.zecko.retailer.common.pojo.product.ShopifyProductsData;
import co.zecko.retailer.exception.BaseException;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static co.zecko.retailer.common.constant.Header.AFTER_HEADER;
import static co.zecko.retailer.common.constant.Header.BEFORE_HEADER;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductClient extends BaseClient {
    static final String BASE_URI = "/retailer/v1/products";
    String zeckoAccessToken;
    public ProductClient(String zeckoAccessToken) {
        this.zeckoAccessToken = zeckoAccessToken;
    }
    public ShopifyProductsData findAll(String collectionId, String after, String before)
            throws BaseException, IOException, InterruptedException {

        zeckoAccessToken = getZeckoAccessToken(zeckoAccessToken);
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);
        Map<String, String> queryParams = new HashMap<>();
        String routeUri = "";
        String url = getUrl(BASE_URI + routeUri);
        if (ObjectUtils.isEmpty(collectionId)) {
            throw new BaseException("Missing required argument 'collectionId'",
                    HttpStatus.BAD_REQUEST);
        }
        if (!StringUtils.isEmpty(after)) {
            queryParams.put(AFTER_HEADER, after);
        }

        if (!StringUtils.isEmpty(before)) {
            queryParams.put(BEFORE_HEADER, before);
        }
        queryParams.put("collectionId",collectionId);
        return get(url, queryParams, headers, new TypeReference<>() {});
    }
}
