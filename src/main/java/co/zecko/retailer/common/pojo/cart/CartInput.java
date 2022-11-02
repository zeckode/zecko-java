package co.zecko.retailer.common.pojo.cart;

import co.zecko.retailer.common.pojo.address.AddressInput;
import co.zecko.retailer.common.pojo.base.BaseEntry;
import co.zecko.retailer.common.pojo.discount.DiscountInput;
import co.zecko.retailer.common.pojo.shipping.ShippingLineInput;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;
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
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonInclude(Include.NON_NULL)
public class CartInput extends BaseEntry implements Serializable {

    private static final long serialVersionUID = -6070773562100775482L;

    @JsonInclude(Include.NON_NULL)
    String customerId;

    @JsonInclude(Include.NON_NULL)
    String email;

    @JsonInclude(Include.NON_NULL)
    List<CartLineItemInput> lineItems;

    @JsonInclude(Include.NON_DEFAULT)
    DiscountInput appliedDiscount;

    @JsonInclude(Include.NON_NULL)
    AddressInput shippingAddress;

    ShippingLineInput shippingLine;
}
