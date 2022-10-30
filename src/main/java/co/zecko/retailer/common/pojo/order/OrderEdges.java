package co.zecko.retailer.common.pojo.order;

import co.zecko.retailer.common.pojo.PageInfo;
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
public class OrderEdges implements Serializable {

    private static final long serialVersionUID = -5474614320809577411L;

    List<OrderEdge> edges;

    PageInfo pageInfo;
}
