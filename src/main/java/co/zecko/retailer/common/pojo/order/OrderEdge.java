package co.zecko.retailer.common.pojo.order;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderEdge implements Serializable {

    private static final long serialVersionUID = -5505095130240696402L;

    String cursor;

    Order node;
}
