package co.zecko.retailer.common.pojo.shipping;

import co.zecko.commonPublic.java.pojo.BaseEntry;
import co.zecko.retailer.common.pojo.money.Money;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
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
public class AvailableShippingRate extends BaseEntry implements Serializable {

    private static final long serialVersionUID = -4662268099908092687L;

    String handle;

    Money price;

    String title;
}
