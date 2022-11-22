package co.zecko.retailer.common.pojo;

import co.zecko.common.java.pojo.BaseEntry;
import co.zecko.retailer.common.pojo.money.MoneyBag;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
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
@JsonInclude(Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Taxline extends BaseEntry implements Serializable {

    private static final long serialVersionUID = -6402703595911538833L;

    Boolean channelLiable;

    MoneyBag priceSet;

    Double rate;

    Double ratePercentage;

    String title;
}
