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
public class DiscountCodeInput implements Serializable {

    private static final long serialVersionUID = -4823971945654493204L;

    DiscountCodeType type;

    String code;
}
