package co.zecko.retailer.common.pojo.order;

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
public class OrdersData implements Serializable {

    private static final long serialVersionUID = -7654807291809597669L;

    OrderEdgesWrapper data;
}
