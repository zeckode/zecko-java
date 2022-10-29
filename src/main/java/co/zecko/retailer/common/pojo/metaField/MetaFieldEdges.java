package co.zecko.retailer.common.pojo.metaField;

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
public class MetaFieldEdges implements Serializable {

    private static final long serialVersionUID = -4102846227478386245L;

    List<MetaFieldEdge> edges;

    PageInfo pageInfo;
}
