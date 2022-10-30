package co.zecko.retailer.common.pojo.cart;

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
public class CartActionRequest implements Serializable {

    private static final long serialVersionUID = -5086294457533804708L;

    String customerId;

    String variantId;

    Integer quantity;
}
