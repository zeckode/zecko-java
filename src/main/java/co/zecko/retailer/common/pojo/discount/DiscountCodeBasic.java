package co.zecko.retailer.common.pojo.discount;

import co.zecko.retailer.common.enums.DiscountStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
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
public class DiscountCodeBasic extends DiscountCodeNode {

    private static final long serialVersionUID = 2232438651113579690L;

    CustomerDiscount customerGets;

    DiscountStatus status;

    String summary;

    String title;
}
