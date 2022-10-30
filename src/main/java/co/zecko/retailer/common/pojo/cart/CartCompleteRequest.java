package co.zecko.retailer.common.pojo.cart;

import co.zecko.retailer.common.pojo.payment.PaymentInfo;
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
public class CartCompleteRequest implements Serializable {

    private static final long serialVersionUID = -6436891047426819720L;

    PaymentInfo payment;
}
