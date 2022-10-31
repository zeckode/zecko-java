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
public class InventoryUnitData implements Serializable {

    private static final long serialVersionUID = 176357045418588227L;

    InventoryUnitResponse inventoryUnitResponse;
}
