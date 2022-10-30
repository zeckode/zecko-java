package co.zecko.retailer.common.pojo;

import co.zecko.retailer.common.pojo.money.MoneyBag;
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
public class Taxline implements Serializable {

    private static final long serialVersionUID = -6402703595911538833L;

    Boolean channelLiable;

    MoneyBag priceSet;

    Double rate;

    Double ratePercentage;

    String title;
}
