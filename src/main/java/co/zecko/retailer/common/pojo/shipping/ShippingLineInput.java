package co.zecko.retailer.common.pojo.shipping;

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
public class ShippingLineInput implements Serializable {

    private static final long serialVersionUID = 7079315258681936382L;

    String price;

    String shippingRateHandle;

    String title;
}
