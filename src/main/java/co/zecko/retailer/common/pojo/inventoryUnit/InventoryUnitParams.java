package co.zecko.retailer.common.pojo.inventoryUnit;

import co.zecko.retailer.common.enums.InventoryUnitEvent;
import co.zecko.retailer.common.pojo.base.BaseDataBaseEntry;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InventoryUnitParams extends BaseDataBaseEntry implements Serializable {

    private static final long serialVersionUID = 9106211456071786012L;

    InventoryUnitEvent event;

    String cancelReason;

    String returnReason;

    String exchangeReason;
}
