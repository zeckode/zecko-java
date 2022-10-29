package co.zecko.retailer.common.pojo.price;

import co.zecko.retailer.common.pojo.money.Money;
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
public class PriceRange implements Serializable {

    private static final long serialVersionUID = 2600442786028355974L;

    Money maxVariantPrice;

    Money minVariantPrice;
}
