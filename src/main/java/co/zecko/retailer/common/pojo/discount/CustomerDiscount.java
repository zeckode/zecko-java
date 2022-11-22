package co.zecko.retailer.common.pojo.discount;

import co.zecko.common.java.pojo.BaseEntry;
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
public class CustomerDiscount extends BaseEntry implements Serializable {

    private static final long serialVersionUID = -1541451561033364748L;

    CustomerDiscountValue value;
}
