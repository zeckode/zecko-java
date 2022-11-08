package co.zecko.retailer.common.pojo.cart;


import co.zecko.retailer.common.pojo.UserError;
import co.zecko.retailer.common.pojo.base.BaseEntry;
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
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CartWrapper extends BaseEntry implements Serializable {

    private static final long serialVersionUID = 5066662543026231010L;

    Cart cart;

    List<UserError> userErrors;
}
