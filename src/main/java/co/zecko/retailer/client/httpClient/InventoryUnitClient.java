package co.zecko.retailer.client.httpClient;

import co.zecko.retailer.common.enums.HttpStatus;
import co.zecko.retailer.common.pojo.InventoryUnitHistory.InventoryUnitHistoryResponse;
import co.zecko.retailer.common.pojo.inventoryUnit.InventoryUnitParams;
import co.zecko.retailer.common.pojo.inventoryUnit.InventoryUnitResponseWrapper;
import co.zecko.retailer.exception.ZeckoException;
import com.fasterxml.jackson.core.type.TypeReference;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class InventoryUnitClient extends BaseClient {

    static final String BASE_URI = "/retailer/v1/inventoryUnits";
    final String zeckoAccessToken;
    public InventoryUnitClient(String zeckoAccessToken) {
        this.zeckoAccessToken = zeckoAccessToken;
    }

    public InventoryUnitHistoryResponse InventoryUnitHistoryResponse(String id)
        throws InterruptedException, ZeckoException, IOException {
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);
        Map<String, String> queryParams = new HashMap<>();
        String routeUri = "";

        if (StringUtils.isEmpty(id)) {
            String message = "Missing required parameter: id";
            throw new ZeckoException(message, HttpStatus.BAD_REQUEST);
        }
        routeUri = String.format("/%s/track", id);

        String url = getUrl(BASE_URI + routeUri);

        return get(url, queryParams, headers, new TypeReference<>() {});
    }

    public InventoryUnitResponseWrapper cancelInventoryUnit(String id, InventoryUnitParams inventoryUnitParams)
            throws ZeckoException, IOException, InterruptedException{
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);
        String routeUri = "";
        if (StringUtils.isEmpty(id)) {
            String message = "Missing required parameter: id";
            throw new ZeckoException(message, HttpStatus.BAD_REQUEST);
        }

        if(ObjectUtils.isEmpty(inventoryUnitParams)){
            String message = "Missing required parameter: inventoryUnitParams";
            throw new ZeckoException(message, HttpStatus.BAD_REQUEST);
        }

        routeUri = String.format("/%s/cancel", id);

        String url = getUrl(BASE_URI + routeUri);

        return post(url, inventoryUnitParams, headers, new TypeReference<>() {});
    }

    public InventoryUnitResponseWrapper returnInventoryUnit(String id, InventoryUnitParams inventoryUnitParams)
            throws ZeckoException, IOException, InterruptedException{
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);
        String routeUri = "";
        if (StringUtils.isEmpty(id)) {
            String message = "Missing required parameter: inventoryUnitId";
            throw new ZeckoException(message, HttpStatus.BAD_REQUEST);
        }

        if(ObjectUtils.isEmpty(inventoryUnitParams)){
            String message = "Missing required parameter: inventoryUnitParams";
            throw new ZeckoException(message, HttpStatus.BAD_REQUEST);
        }

        routeUri = String.format("/%s/return", id);

        String url = getUrl(BASE_URI + routeUri);

        return post(url, inventoryUnitParams, headers, new TypeReference<>() {});
    }

    public InventoryUnitResponseWrapper exchangeInventoryUnit(String id, InventoryUnitParams inventoryUnitParams)
            throws ZeckoException, IOException, InterruptedException{
        Map<String, String> headers = getBaseHeaders(zeckoAccessToken);
        String routeUri = "";
        if (StringUtils.isEmpty(id)) {
            String message = "Missing required parameter: inventoryUnitId";
            throw new ZeckoException(message, HttpStatus.BAD_REQUEST);
        }

        if(ObjectUtils.isEmpty(inventoryUnitParams)){
            String message = "Missing required parameter: inventoryUnitParams";
            throw new ZeckoException(message, HttpStatus.BAD_REQUEST);
        }

        routeUri = String.format("/%s/exchange", id);

        String url = getUrl(BASE_URI + routeUri);

        return post(url, inventoryUnitParams, headers, new TypeReference<>() {});
    }


}
