package co.zecko.retailer.common.pojo.inventoryUnit;

import co.zecko.commonPublic.java.pojo.BaseDataBaseEntry;
import co.zecko.retailer.common.pojo.interfaces.WebhookData;
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
public class InventoryUnitResponseWrapper extends BaseDataBaseEntry implements Serializable,
    WebhookData<InventoryUnitData> {

    private static final long serialVersionUID = -8670490714965035556L;

    InventoryUnitData data;
}
