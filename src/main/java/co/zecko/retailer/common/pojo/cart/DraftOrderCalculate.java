package co.zecko.retailer.common.pojo.cart;

import co.zecko.retailer.common.pojo.UserError;
import co.zecko.common.java.pojo.BaseEntry;
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
public class DraftOrderCalculate extends BaseEntry implements Serializable {

    private static final long serialVersionUID = -8427905189291205771L;

    CalculatedDraftOrder calculatedDraftOrder;

    List<UserError> userErrors;
}
