package co.zecko.retailer.common.pojo.discount;

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
public class CustomerDiscount implements Serializable {

    private static final long serialVersionUID = -1541451561033364748L;

    CustomerDiscountValue value;
}