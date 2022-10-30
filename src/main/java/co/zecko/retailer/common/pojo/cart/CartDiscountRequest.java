package co.zecko.retailer.common.pojo.cart;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CartDiscountRequest implements Serializable {

    private static final long serialVersionUID = -155063851083306383L;

    List<DiscountCodeInput> discounts;
}
