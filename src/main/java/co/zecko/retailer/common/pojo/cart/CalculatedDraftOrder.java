package co.zecko.retailer.common.pojo.cart;

import co.zecko.common.java.pojo.BaseEntry;
import co.zecko.retailer.common.pojo.shipping.AvailableShippingRate;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CalculatedDraftOrder extends BaseEntry implements Serializable {

    private static final long serialVersionUID = -3458947137878877045L;

    List<AvailableShippingRate> availableShippingRates;
}
