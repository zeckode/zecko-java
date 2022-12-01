package co.zecko.retailer.common.pojo.inventoryUnit;

import co.zecko.commonPublic.java.pojo.BaseDataBaseEntry;
import co.zecko.retailer.common.enums.InventoryUnitStatus;
import co.zecko.retailer.common.pojo.lineItem.LineItem;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InventoryUnitEntry extends BaseDataBaseEntry {

    private static final long serialVersionUID = -5952840055117933760L;

    String lineItemId;

    String legacyOrderId;

    InventoryUnitStatus status;

    String shopName;

    LineItem lineItem;

    String legacyVariantId;

    String legacyProductId;

    Date cancelEligibleThrough;

    Date returnEligibleThrough;

    Date exchangeEligibleThrough;

    Boolean isCancellable;

    Boolean isReturnable;

    Boolean isExchangeable;

    String cancelReason;

    String returnReason;

    String exchangeReason;

    String brandReturnPolicyURL;

    Boolean isNoQuestionsAskedReturnAvailable;

    String returnText;

    public InventoryUnitEntry(String lineItemId, String legacyOrderId, InventoryUnitStatus status,
        String shopName, LineItem lineItem, String legacyVariantId, String legacyProductId) {

        this.lineItemId = lineItemId;
        this.legacyOrderId = legacyOrderId;
        this.status = status;
        this.shopName = shopName;
        this.lineItem = lineItem;
        this.legacyVariantId = legacyVariantId;
        this.legacyProductId = legacyProductId;
    }
}
