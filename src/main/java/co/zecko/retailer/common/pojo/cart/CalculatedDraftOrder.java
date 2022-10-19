package co.zecko.retailer.common.pojo.cart;

import co.zecko.retailer.common.pojo.shipping.AvailableShippingRate;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.List;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CalculatedDraftOrder implements Serializable {

    private static final long serialVersionUID = -3458947137878877045L;

    List<AvailableShippingRate> availableShippingRates;
}
