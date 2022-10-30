package co.zecko.retailer.common.pojo.inventoryUnit;

import co.zecko.retailer.common.enums.InventoryUnitStatus;
import co.zecko.retailer.common.pojo.lineItem.LineItem;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InventoryUnitResponse {

    private static final long serialVersionUID = 4685444730940173701L;

    String id;

    InventoryUnitStatus status;

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

    String orderId;

    LineItem lineItem;
}
