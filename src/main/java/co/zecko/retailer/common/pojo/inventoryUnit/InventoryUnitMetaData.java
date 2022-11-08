package co.zecko.retailer.common.pojo.inventoryUnit;

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
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InventoryUnitMetaData extends BaseDataBaseEntry implements Serializable {

    private static final long serialVersionUID = -236326666047014122L;

    String cancelReason;

    String returnReason;

    String exchangeReason;
}
