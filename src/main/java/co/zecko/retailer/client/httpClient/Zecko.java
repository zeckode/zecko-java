package co.zecko.retailer.client.httpClient;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Zecko {
    public final CollectionClient collectionClient;

    public final ProductClient productClient;

    public final CartClient cartClient;

    public final OrderClient orderClient;

    public final InventoryUnitClient inventoryUnitClient;

    public Zecko(String zeckoAccessToken) {
        this.collectionClient = new CollectionClient(zeckoAccessToken);
        this.productClient = new ProductClient(zeckoAccessToken);
        this.cartClient = new CartClient(zeckoAccessToken);
        this.orderClient = new OrderClient(zeckoAccessToken);
        this.inventoryUnitClient = new InventoryUnitClient(zeckoAccessToken);
    }
}
