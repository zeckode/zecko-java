package co.zecko.retailer.common.pojo.collection;

import co.zecko.retailer.common.pojo.PageInfo;
import co.zecko.retailer.common.pojo.base.BaseEntry;
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
public class CollectionEdges extends BaseEntry implements Serializable {

    private static final long serialVersionUID = -549827740704428707L;

    List<CollectionEdge> edges;

    PageInfo pageInfo;
}
