package co.zecko.retailer.common.pojo.InventoryUnitHistory;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InventoryUnitHistoryWrapper implements Serializable {

    private static final long serialVersionUID = -442616495729170935L;

    List<InventoryUnitHistoryEntry> history;
}
