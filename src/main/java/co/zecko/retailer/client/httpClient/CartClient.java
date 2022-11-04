package co.zecko.retailer.client.httpClient;

import co.zecko.retailer.common.enums.HttpStatus;
import co.zecko.retailer.common.pojo.cart.*;
import co.zecko.retailer.common.pojo.order.OrderData;
import co.zecko.retailer.exception.ZeckoException;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@FieldDefaults(level = AccessLevel.PACKAGE)
public class CartClient extends BaseClient {

    static final String BASE_URI = "/retailer/v1/carts";
    final String zeckoAccessToken;
    public CartClient(String zeckoAccessToken) {
        this.zeckoAccessToken = zeckoAccessToken;
    }

    public CartData findByClientCustomerId(String clientCustomerId)
            throws ZeckoException, IOException, InterruptedException {
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);
        Map<String, String> queryParams = new HashMap<>();
        String routeUri = "";

        if (StringUtils.isEmpty(clientCustomerId)) {
            String message = "Missing required parameter clientCustomerId";
            throw new ZeckoException(message, HttpStatus.BAD_REQUEST);
        }

        queryParams.put("customerId",clientCustomerId);

        String url = getUrl(BASE_URI + routeUri);

        return get(url, queryParams, headers, new TypeReference<>() {});
    }
    public CartData addToCart(CartActionRequest cartActionRequest)
        throws ZeckoException, IOException, InterruptedException{
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);
        String routeUri = "/add";
        String url = getUrl(BASE_URI + routeUri);

        if(ObjectUtils.isEmpty(cartActionRequest)){
            String message = "Missing required parameter cartActionRequest";
            throw new ZeckoException(message, HttpStatus.BAD_REQUEST);
        }

        return patch(url, cartActionRequest, headers, new TypeReference<>() {});
    }

    public CartData deleteFromCart(CartActionRequest cartActionRequest)
            throws ZeckoException, IOException, InterruptedException{
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);
        String routeUri = "/delete";
        String url = getUrl(BASE_URI + routeUri);

        if(ObjectUtils.isEmpty(cartActionRequest)){
            String message = "Missing required parameter cartActionRequest";
            throw new ZeckoException(message, HttpStatus.BAD_REQUEST);
        }

        return patch(url, cartActionRequest, headers, new TypeReference<>() {});
    }


    public CartData update(String legacyDraftOrderId, CartUpdateRequest cartUpdateRequest)
            throws ZeckoException, IOException, InterruptedException{
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);
        String routeUri = String.format("/%s/update", legacyDraftOrderId);
        String url = getUrl(BASE_URI + routeUri);

        if(ObjectUtils.isEmpty(cartUpdateRequest)){
            String message = "Missing required parameter cartUpdateRequest";
            throw new ZeckoException(message, HttpStatus.BAD_REQUEST);
        }

        return patch(url, cartUpdateRequest, headers, new TypeReference<>() {});
    }

    public CartData addDiscount(String legacyDraftOrderId, CartDiscountRequest cartDiscountRequest)
            throws ZeckoException, IOException, InterruptedException{
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);

        if(StringUtils.isEmpty(legacyDraftOrderId)){
            String message = "Missing required parameter legacyDraftOrderId";
            throw new ZeckoException(message, HttpStatus.BAD_REQUEST);
        }

        if(ObjectUtils.isEmpty(cartDiscountRequest)){
            String message = "Missing required parameter cartDiscountRequest";
            throw new ZeckoException(message, HttpStatus.BAD_REQUEST);
        }

        String routeUri = String.format("/%s/add-discount", legacyDraftOrderId);
        String url = getUrl(BASE_URI + routeUri);

        return patch(url, cartDiscountRequest, headers, new TypeReference<>() {});
    }

    public CartData removeDiscount(String legacyDraftOrderId, CartDiscountRequest cartDiscountRequest)
            throws ZeckoException, IOException, InterruptedException{
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);

        if(StringUtils.isEmpty(legacyDraftOrderId)){
            String message = "Missing required parameter legacyDraftOrderId";
            throw new ZeckoException(message, HttpStatus.BAD_REQUEST);
        }

        if(ObjectUtils.isEmpty(cartDiscountRequest)){
            String message = "Missing required parameter cartDiscountRequest";
            throw new ZeckoException(message, HttpStatus.BAD_REQUEST);
        }

        String routeUri = String.format("/%s/remove-discount", legacyDraftOrderId);
        String url = getUrl(BASE_URI + routeUri);

        return patch(url, cartDiscountRequest, headers, new TypeReference<>() {});
    }

    public OrderData complete(String legacyDraftOrderId, CartCompleteRequest cartCompleteRequest)
            throws ZeckoException, IOException, InterruptedException{
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);

        if(StringUtils.isEmpty(legacyDraftOrderId)){
            String message = "Missing required parameter legacyDraftOrderId";
            throw new ZeckoException(message, HttpStatus.BAD_REQUEST);
        }

        if(ObjectUtils.isEmpty(cartCompleteRequest)){
            String message = "Missing required parameter cartCompleteRequest";
            throw new ZeckoException(message, HttpStatus.BAD_REQUEST);
        }

        String routeUri = String.format("/%s/complete", legacyDraftOrderId);
        String url = getUrl(BASE_URI + routeUri);

        return post(url, cartCompleteRequest, headers, new TypeReference<>() {});
    }

    public DraftOrderDeleteResponseWrapper delete(String clientCustomerId)
            throws ZeckoException, IOException, InterruptedException{
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);
        Map<String, String> queryParams = new HashMap<>();
        String routeUri = "";
        String url = getUrl(BASE_URI + routeUri);

        if (StringUtils.isEmpty(clientCustomerId)) {
            String message = "Missing required parameter clientCustomerId";
            throw new ZeckoException(message, HttpStatus.BAD_REQUEST);
        }
        queryParams.put("customerId", clientCustomerId);

        return delete(url,queryParams, headers, new TypeReference<>() {});
    }
}
