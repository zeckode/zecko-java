package co.zecko.retailer.client.httpClient;

import co.zecko.retailer.common.enums.HttpStatus;
import co.zecko.retailer.common.pojo.product.ProductData;
import co.zecko.retailer.common.pojo.product.ProductsData;
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
    public ProductsData findAll(String collectionId, String after, String before)
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
    public ProductData findById(String id, String imagesBefore, String imagesAfter, String variantsBefore, String variantsAfter,String metaFieldsBefore, String metaFieldsAfter)
            throws BaseException, IOException, InterruptedException{
        zeckoAccessToken = getZeckoAccessToken(zeckoAccessToken);
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);
        Map<String, String> queryParams = new HashMap<>();
        String routeUri = "";

        if (StringUtils.isEmpty(id)) {
            String message = "Product ID can not be empty";
            throw new BaseException(message, HttpStatus.BAD_REQUEST);
        }
        if (!StringUtils.isEmpty(imagesBefore)) {
            queryParams.put("imageBefore", imagesBefore);
        }
        if (!StringUtils.isEmpty(imagesAfter)) {
            queryParams.put("imagesAfter", imagesAfter);
        }
        if (!StringUtils.isEmpty(variantsBefore)) {
            queryParams.put("variantsBefore", variantsBefore);
        }
        if (!StringUtils.isEmpty(variantsAfter)) {
            queryParams.put("variantsAfter", variantsAfter);
        }
        if (!StringUtils.isEmpty(metaFieldsBefore)) {
            queryParams.put("metaFieldsBefore", metaFieldsBefore);
        }
        if (!StringUtils.isEmpty(metaFieldsAfter)) {
            queryParams.put("metaFieldsAfter", metaFieldsAfter);
        }
        routeUri = String.format("/%s", id);

        String url = getUrl(BASE_URI + routeUri);

        return get(url, queryParams, headers, new TypeReference<>() {});
    }
}
