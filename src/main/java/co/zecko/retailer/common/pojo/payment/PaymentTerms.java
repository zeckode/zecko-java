package co.zecko.retailer.common.pojo.payment;

import co.zecko.retailer.common.enums.PaymentTermsName;
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
public class PaymentTerms implements Serializable {

    private static final long serialVersionUID = -5766629433803663255L;

    PaymentTermsName paymentTermsName;
}
