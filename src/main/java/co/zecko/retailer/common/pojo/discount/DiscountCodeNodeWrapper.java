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
public class DiscountCodeNodeWrapper implements Serializable {

    private static final long serialVersionUID = -2781941672746700858L;

    DiscountCodeNode codeDiscount;

    String id;
}
