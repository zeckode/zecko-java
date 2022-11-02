package co.zecko.retailer.common.pojo.product;

import co.zecko.retailer.common.pojo.base.BaseEntry;
import co.zecko.retailer.common.pojo.product.ProductEdgesWrapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;
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
@JsonInclude(Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductsData extends BaseEntry implements Serializable {

    private static final long serialVersionUID = 303529459065634177L;

    ProductEdgesWrapper data;
}
