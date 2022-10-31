package co.zecko.retailer.common.pojo.order;

import co.zecko.retailer.common.pojo.UserError;
import java.io.Serializable;
import java.util.List;

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
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderWrapper implements Serializable {

    private static final long serialVersionUID = 1469150603141303496L;

    Order order;

    List<UserError> userErrors;
}