package co.zecko.retailer.common.pojo.variant;

import co.zecko.retailer.common.pojo.SelectedOption;
import co.zecko.retailer.common.pojo.image.Image;
import co.zecko.retailer.common.pojo.product.Product;
import co.zecko.retailer.common.util.DiscountUtil;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
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
@JsonInclude(Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Variant implements Serializable {

    private static final long serialVersionUID = 4504096969213459970L;

    private static final String DEFAULT_TITLE_STRING = " - Default Title";

    Boolean availableForSale;

    String compareAtPrice;

    String discountPercentage;

    String displayName;

    String id;

    Image image;

//    ProductVariantInventoryPolicy inventoryPolicy;

    Integer inventoryQuantity;

    Integer position;

    String price;

    Product product;

    List<SelectedOption> selectedOptions;

    String sku;

    String taxCode;

    Boolean taxable;

    String title;

//    List<MediaEntry> media;

    public String getDisplayName() {

        if (displayName != null && displayName.contains(DEFAULT_TITLE_STRING)) {
            return displayName.replace(DEFAULT_TITLE_STRING, "");
        }

        return displayName;
    }

    public String getDiscountPercentage() {
        return DiscountUtil.getDiscountPercentage(getPrice(), getCompareAtPrice());
    }
}
