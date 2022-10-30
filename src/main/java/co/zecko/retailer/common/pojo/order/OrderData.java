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
public class OrderData implements Serializable {

    private static final long serialVersionUID = 7958309580198177297L;

    OrderWrapper data;
}
