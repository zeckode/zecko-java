package co.zecko.retailer.common.pojo.discount;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DiscountPercentage extends CustomerDiscountValue {

    private static final long serialVersionUID = 8176870354141399356L;

    Double percentage;
}
