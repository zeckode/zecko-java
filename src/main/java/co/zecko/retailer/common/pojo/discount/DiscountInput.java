package co.zecko.retailer.common.pojo.discount;

import co.zecko.retailer.common.enums.DiscountType;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DiscountInput implements Serializable {

    private static final long serialVersionUID = 76044956019468599L;

    String amount;

    String description;

    String title;

    Double value;

    DiscountType valueType;

}
