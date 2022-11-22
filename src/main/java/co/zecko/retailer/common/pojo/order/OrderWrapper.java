package co.zecko.retailer.common.pojo.order;

import co.zecko.retailer.common.pojo.UserError;
import java.io.Serializable;
import java.util.List;

import co.zecko.common.java.pojo.BaseEntry;
import com.fasterxml.jackson.annotation.JsonInclude;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderWrapper extends BaseEntry implements Serializable {

    private static final long serialVersionUID = 1469150603141303496L;

    Order order;

    List<UserError> userErrors;
}
