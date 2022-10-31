package co.zecko.retailer.common.pojo.InventoryUnitHistory;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InventoryUnitHistoryResponse implements Serializable {

    private static final long serialVersionUID = 6351949180022164583L;

    InventoryUnitHistoryWrapper data;
}
