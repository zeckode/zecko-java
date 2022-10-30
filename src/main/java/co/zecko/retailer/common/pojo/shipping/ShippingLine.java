package co.zecko.retailer.common.pojo.shipping;

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
public class ShippingLine {

    private static final long serialVersionUID = 8655528852604585746L;

    String code;

    String title;
}
