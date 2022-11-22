package co.zecko.retailer.common.pojo.money;

import co.zecko.retailer.common.enums.CurrencyCode;
import co.zecko.common.java.pojo.BaseEntry;
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
public class Money extends BaseEntry implements Serializable  {

    private static final long serialVersionUID = -8145191057962062326L;

    String amount;

    CurrencyCode currencyCode;
}
