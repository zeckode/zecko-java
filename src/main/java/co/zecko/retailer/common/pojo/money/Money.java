package co.zecko.retailer.common.pojo.money;

import co.zecko.retailer.common.enums.CurrencyCode;
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
public class Money implements Serializable {

    private static final long serialVersionUID = -8145191057962062326L;

    String amount;

    CurrencyCode currencyCode;
}