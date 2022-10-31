package co.zecko.retailer.client.httpClient;

import co.zecko.retailer.common.enums.HttpStatus;
import co.zecko.retailer.common.pojo.cart.*;
import co.zecko.retailer.common.pojo.order.OrderData;
import co.zecko.retailer.exception.BaseException;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@FieldDefaults(level = AccessLevel.PACKAGE)
public class CartClient extends BaseClient {

    static final String BASE_URI = "/retailer/v1/carts";
    String zeckoAccessToken;
    public CartClient(String zeckoAccessToken) {
        this.zeckoAccessToken = zeckoAccessToken;
    }

    public CartData findByClientCustomerId(String clientCustomerId)
            throws BaseException, IOException, InterruptedException {
        zeckoAccessToken = getZeckoAccessToken(zeckoAccessToken);
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);
        Map<String, String> queryParams = new HashMap<>();
        String routeUri = "";

        if (StringUtils.isEmpty(clientCustomerId)) {
            String message = "Customer ID can not be empty";
            throw new BaseException(message, HttpStatus.BAD_REQUEST);
        }

        queryParams.put("customerId",clientCustomerId);

        String url = getUrl(BASE_URI + routeUri);

        return get(url, queryParams, headers, new TypeReference<>() {});
    }
    public CartData addToCart(CartActionRequest cartActionRequest)
        throws BaseException, IOException, InterruptedException{
        zeckoAccessToken = getZeckoAccessToken(zeckoAccessToken);
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);
        String routeUri = "/add";
        String url = getUrl(BASE_URI + routeUri);

        return patch(url, cartActionRequest, headers, new TypeReference<>() {});
    }

    public CartData deleteFromCart(CartActionRequest cartActionRequest)
            throws BaseException, IOException, InterruptedException{
        zeckoAccessToken = getZeckoAccessToken(zeckoAccessToken);
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);
        String routeUri = "/delete";
        String url = getUrl(BASE_URI + routeUri);

        return patch(url, cartActionRequest, headers, new TypeReference<>() {});
    }


    public CartData update(String legacyDraftOrderId, CartUpdateRequest cartUpdateRequest)
            throws BaseException, IOException, InterruptedException{
        zeckoAccessToken = getZeckoAccessToken(zeckoAccessToken);
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);
        String routeUri = String.format("/%s/update", legacyDraftOrderId);
        String url = getUrl(BASE_URI + routeUri);

        return patch(url, cartUpdateRequest, headers, new TypeReference<>() {});
    }

    public CartData addDiscount(String legacyDraftOrderId, CartDiscountRequest cartDiscountRequest)
            throws BaseException, IOException, InterruptedException{
        zeckoAccessToken = getZeckoAccessToken(zeckoAccessToken);
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);
        String routeUri = String.format("/%s/add-discount", legacyDraftOrderId);
        String url = getUrl(BASE_URI + routeUri);

        return patch(url, cartDiscountRequest, headers, new TypeReference<>() {});
    }

    public CartData removeDiscount(String legacyDraftOrderId, CartDiscountRequest cartDiscountRequest)
            throws BaseException, IOException, InterruptedException{
        zeckoAccessToken = getZeckoAccessToken(zeckoAccessToken);
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);
        String routeUri = String.format("/%s/remove-discount", legacyDraftOrderId);
        String url = getUrl(BASE_URI + routeUri);

        return patch(url, cartDiscountRequest, headers, new TypeReference<>() {});
    }

    public OrderData complete(String legacyDraftOrderId, CartCompleteRequest cartCompleteRequest)
            throws BaseException, IOException, InterruptedException{
        zeckoAccessToken = getZeckoAccessToken(zeckoAccessToken);
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);
        String routeUri = String.format("/%s/complete", legacyDraftOrderId);
        String url = getUrl(BASE_URI + routeUri);

        return post(url, cartCompleteRequest, headers, new TypeReference<>() {});
    }

    public DraftOrderDeleteResponseWrapper delete(String clientCustomerId)
            throws BaseException, IOException, InterruptedException{
        zeckoAccessToken = getZeckoAccessToken(zeckoAccessToken);
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);
        Map<String, String> queryParams = new HashMap<>();
        String routeUri = "";
        String url = getUrl(BASE_URI + routeUri);

        if (StringUtils.isEmpty(clientCustomerId)) {
            String message = "Customer ID can not be empty";
            throw new BaseException(message, HttpStatus.BAD_REQUEST);
        }
        queryParams.put("customerId", clientCustomerId);

        return delete(url,queryParams, headers, new TypeReference<>() {});
    }
}
