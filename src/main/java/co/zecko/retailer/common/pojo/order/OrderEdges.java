package co.zecko.retailer.common.pojo.order;

import co.zecko.retailer.common.pojo.PageInfo;
import co.zecko.commonPublic.java.pojo.BaseEntry;
import com.fasterxml.jackson.annotation.JsonInclude;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderEdges extends BaseEntry implements Serializable {

    private static final long serialVersionUID = -5474614320809577411L;

    List<OrderEdge> edges;

    PageInfo pageInfo;
}
