package co.zecko.retailer.common.pojo.variant;

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
public class VariantEdges implements Serializable {

    private static final long serialVersionUID = 5783480552435384243L;

    List<VariantEdge> edges;

    PageInfo pageInfo;
}
