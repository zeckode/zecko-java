package co.zecko.retailer.common.pojo;

import co.zecko.retailer.common.enums.DiscountType;
import co.zecko.retailer.common.pojo.money.Money;
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
public class Discount implements Serializable {

    private static final long serialVersionUID = -3000015802668351548L;

    String amount;

    Money amountV2;

    String description;

    String title;

    Double value;

    DiscountType valueType;
}
