package co.zecko.retailer.client.httpClient;

import co.zecko.retailer.common.enums.HttpStatus;
import co.zecko.retailer.common.pojo.InventoryUnitHistory.InventoryUnitHistoryResponse;
import co.zecko.retailer.common.pojo.cart.CartCompleteRequest;
import co.zecko.retailer.common.pojo.inventoryUnit.InventoryUnitParams;
import co.zecko.retailer.common.pojo.inventoryUnit.InventoryUnitResponseWrapper;
import co.zecko.retailer.common.pojo.order.OrderData;
import co.zecko.retailer.exception.BaseException;
import com.fasterxml.jackson.core.type.TypeReference;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class InventoryUnitClient extends BaseClient {

    static final String BASE_URI = "/retailer/v1/inventoryUnits";
    String zeckoAccessToken;
    public InventoryUnitClient(String zeckoAccessToken) {
        this.zeckoAccessToken = zeckoAccessToken;
    }

    public InventoryUnitHistoryResponse InventoryUnitHistoryResponse(String id)
        throws InterruptedException, BaseException, IOException {
        zeckoAccessToken = getZeckoAccessToken(zeckoAccessToken);
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);
        Map<String, String> queryParams = new HashMap<>();
        String routeUri = "";

        if (StringUtils.isEmpty(id)) {
            String message = "Unit ID can not be empty";
            throw new BaseException(message, HttpStatus.BAD_REQUEST);
        }
        routeUri = String.format("/%s/track", id);

        String url = getUrl(BASE_URI + routeUri);

        return get(url, queryParams, headers, new TypeReference<>() {});
    }

    public InventoryUnitResponseWrapper cancelInventoryUnit(String id, InventoryUnitParams inventoryUnitParams)
            throws BaseException, IOException, InterruptedException{
        zeckoAccessToken = getZeckoAccessToken(zeckoAccessToken);
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);
        String routeUri = "";
        if (StringUtils.isEmpty(id)) {
            String message = "Unit ID can not be empty";
            throw new BaseException(message, HttpStatus.BAD_REQUEST);
        }
        routeUri = String.format("/%s/cancel", id);

        String url = getUrl(BASE_URI + routeUri);

        return post(url, inventoryUnitParams, headers, new TypeReference<>() {});
    }

    public InventoryUnitResponseWrapper returnInventoryUnit(String id, InventoryUnitParams inventoryUnitParams)
            throws BaseException, IOException, InterruptedException{
        zeckoAccessToken = getZeckoAccessToken(zeckoAccessToken);
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);
        String routeUri = "";
        if (StringUtils.isEmpty(id)) {
            String message = "Unit ID can not be empty";
            throw new BaseException(message, HttpStatus.BAD_REQUEST);
        }
        routeUri = String.format("/%s/return", id);

        String url = getUrl(BASE_URI + routeUri);

        return post(url, inventoryUnitParams, headers, new TypeReference<>() {});
    }

    public InventoryUnitResponseWrapper exchangeInventoryUnit(String id, InventoryUnitParams inventoryUnitParams)
            throws BaseException, IOException, InterruptedException{
        zeckoAccessToken = getZeckoAccessToken(zeckoAccessToken);
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);
        String routeUri = "";
        if (StringUtils.isEmpty(id)) {
            String message = "Unit ID can not be empty";
            throw new BaseException(message, HttpStatus.BAD_REQUEST);
        }
        routeUri = String.format("/%s/exchange", id);

        String url = getUrl(BASE_URI + routeUri);

        return post(url, inventoryUnitParams, headers, new TypeReference<>() {});
    }


}
