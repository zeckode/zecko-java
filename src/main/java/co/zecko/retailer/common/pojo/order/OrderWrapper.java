package co.zecko.retailer.common.pojo.order;

import co.zecko.retailer.common.pojo.UserError;
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
public class OrderWrapper implements Serializable {

    private static final long serialVersionUID = 1469150603141303496L;

    Order order;

    List<UserError> userErrors;
}
