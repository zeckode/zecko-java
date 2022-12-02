package co.zecko.retailer.common.pojo.cart;

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
public class CartEdges extends BaseEntry implements Serializable {

    private static final long serialVersionUID = -7198762085436623517L;

    List<CartEdge> edges;

    PageInfo pageInfo;
}
