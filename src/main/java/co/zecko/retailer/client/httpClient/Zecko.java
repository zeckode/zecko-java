package co.zecko.retailer.client.httpClient;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Zecko {
    public final CollectionClient collectionClient;

    public Zecko(String zeckoAccessToken) {
        this.collectionClient = new CollectionClient(zeckoAccessToken);
    }
}
