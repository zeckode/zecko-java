package co.zecko.retailer.common.pojo.discount;

import co.zecko.retailer.common.enums.DiscountCodeType;
import co.zecko.retailer.common.pojo.base.BaseEntry;
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
public class DiscountCodeInput extends BaseEntry implements Serializable {

    private static final long serialVersionUID = -4823971945654493204L;

    DiscountCodeType type;

    String code;
}
