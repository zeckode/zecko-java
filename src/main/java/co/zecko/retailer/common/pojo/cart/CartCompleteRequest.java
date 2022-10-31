package co.zecko.retailer.common.pojo.cart;

import co.zecko.retailer.common.pojo.payment.PaymentInfo;
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
public class CartCompleteRequest implements Serializable {

    private static final long serialVersionUID = -6436891047426819720L;

    PaymentInfo payment;
}