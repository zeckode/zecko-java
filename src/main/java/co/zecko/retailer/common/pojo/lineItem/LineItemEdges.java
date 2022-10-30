package co.zecko.retailer.common.pojo.lineItem;

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
public class LineItemEdges implements Serializable {

    private static final long serialVersionUID = 8002022434702068095L;

    List<LineItemEdge> edges;

    PageInfo pageInfo;
}
