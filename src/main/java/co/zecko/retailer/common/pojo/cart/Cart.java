package co.zecko.retailer.common.pojo.cart;

import co.zecko.retailer.common.enums.CurrencyCode;
import co.zecko.retailer.common.enums.DraftOrderStatus;
import co.zecko.retailer.common.pojo.Discount;
import co.zecko.retailer.common.pojo.Taxline;
import co.zecko.retailer.common.pojo.address.Address;
import co.zecko.commonPublic.java.pojo.BaseEntry;
import co.zecko.retailer.common.pojo.lineItem.LineItemEdges;
import co.zecko.retailer.common.pojo.order.Order;
import co.zecko.retailer.common.pojo.shipping.AvailableShippingRate;
import co.zecko.retailer.common.pojo.shipping.ShippingLine;
import com.fasterxml.jackson.annotation.JsonInclude;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Cart extends BaseEntry {

    private static final long serialVersionUID = 8300943293454033597L;

    public Cart(String id) {
        this.id = id;
    }

    Discount appliedDiscount;

    Date completedAt;

    Date createdAt;

    CurrencyCode currencyCode;

    String email;

    String id;

    LineItemEdges lineItems;

    Order order;

    Address shippingAddress;

    ShippingLine shippingLine;

    DraftOrderStatus status;

    String subtotalPrice;

    List<String> tags;

    Boolean taxExempt;

    List<Taxline> taxLines;

    Boolean taxesIncluded;

    String totalPrice;

    String totalShippingPrice;

    List<AvailableShippingRate> availableShippingRates;

    String totalTax;

    Date updatedAt;
}
