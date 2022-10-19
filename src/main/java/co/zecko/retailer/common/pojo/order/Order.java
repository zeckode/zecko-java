package co.zecko.retailer.common.pojo.order;

import co.zecko.retailer.common.pojo.Taxline;
import co.zecko.retailer.common.pojo.address.Address;
import co.zecko.retailer.common.pojo.lineItem.LineItemEdges;
import co.zecko.retailer.common.pojo.money.MoneyBag;
import co.zecko.retailer.common.pojo.money.Refund;
import co.zecko.retailer.common.pojo.shipping.ShippingLine;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Order implements Serializable {

    private static final long serialVersionUID = -4121389534433508498L;

    String cancelReason;

    String cancelledAt;

    MoneyBag cartDiscountAmountSet;

    Boolean confirmed;

    Date createdAt;

    MoneyBag currentCartDiscountAmountSet;

    Integer currentSubtotalLineItemsQuantity;

    MoneyBag currentSubtotalPriceSet;

    List<Taxline> currentTaxLines;

    MoneyBag currentTotalDiscountsSet;

    MoneyBag currentTotalPriceSet;

    MoneyBag currentTotalTaxSet;

    Address displayAddress;

    String email;

    Boolean fullyPaid;

    String id;

    LineItemEdges lineItems;

    String phone;

    Date processedAt;

    Boolean refundable;

    List<Refund> refunds;

    Address shippingAddress;

    ShippingLine shippingLine;

    Integer subtotalLineItemsQuantity;

    MoneyBag subtotalPriceSet;

    List<String> tags;

    List<Taxline> taxLines;

    Boolean taxesIncluded;

    Boolean test;

    MoneyBag totalDiscountsSet;

    MoneyBag totalOutstandingSet;

    MoneyBag totalPriceSet;

    MoneyBag totalReceivedSet;

    MoneyBag totalRefundedSet;

    MoneyBag totalRefundedShippingSet;

    MoneyBag totalShippingPriceSet;

    MoneyBag totalTaxSet;

    Boolean unpaid;

    Date updatedAt;
}
