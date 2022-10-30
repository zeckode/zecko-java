package co.zecko.retailer.common.pojo.shipping;

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
public class AvailableShippingRate implements Serializable {

    private static final long serialVersionUID = -4662268099908092687L;

    String handle;

    Money price;

    String title;
}
