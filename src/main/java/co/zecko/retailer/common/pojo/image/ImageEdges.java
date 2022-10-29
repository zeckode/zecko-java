package co.zecko.retailer.common.pojo.image;

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
public class ImageEdges implements Serializable {

    private static final long serialVersionUID = 4991218402925349889L;

    List<ImageEdge> edges;

    PageInfo pageInfo;
}
