package co.zecko.retailer.common.pojo.lineItem;

import co.zecko.retailer.common.pojo.Discount;
import co.zecko.retailer.common.pojo.Taxline;
import co.zecko.retailer.common.pojo.image.Image;
import co.zecko.retailer.common.pojo.inventoryUnit.InventoryUnitResponse;
import co.zecko.retailer.common.pojo.product.Product;
import co.zecko.retailer.common.pojo.variant.Variant;
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
public class LineItem implements Serializable {

    private static final long serialVersionUID = 444002611340855727L;

    Discount appliedDiscount;

    String discountedTotal;

    String discountedUnitPrice;

    String id;

    Image image;

    String name;

    String originalTotal;

    String originalUnitPrice;

    Product product;

    Integer quantity;

    String sku;

    List<Taxline> taxLines;

    Boolean taxable;

    String title;

    String totalDiscount;

    Variant variant;

    String variantTitle;

    String vendor;

    List<InventoryUnitResponse> inventoryUnits;
}
