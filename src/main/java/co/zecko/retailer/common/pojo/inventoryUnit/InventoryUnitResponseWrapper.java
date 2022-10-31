package co.zecko.retailer.common.pojo.inventoryUnit;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InventoryUnitResponseWrapper implements Serializable {

    private static final long serialVersionUID = -8670490714965035556L;

    InventoryUnitData data;
}
