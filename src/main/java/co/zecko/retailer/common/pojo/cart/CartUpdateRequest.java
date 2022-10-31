package co.zecko.retailer.common.pojo.cart;

import co.zecko.retailer.common.pojo.address.AddressInput;
import co.zecko.retailer.common.pojo.customer.Customer;
import co.zecko.retailer.common.pojo.shipping.AvailableShippingRate;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
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
public class CartUpdateRequest implements Serializable {

    private static final long serialVersionUID = -8719091670207245964L;

    Customer customer;

    AddressInput shippingAddress;

    AvailableShippingRate shippingLine;
}
