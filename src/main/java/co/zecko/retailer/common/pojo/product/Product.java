package co.zecko.retailer.common.pojo.product;

import co.zecko.common.java.pojo.BaseEntry;
import co.zecko.retailer.common.enums.ProductStatus;
import co.zecko.retailer.common.pojo.image.Image;
import co.zecko.retailer.common.pojo.image.ImageEdges;
import co.zecko.retailer.common.pojo.metaField.MetaFieldEdges;
import co.zecko.retailer.common.pojo.platform.Platform;
import co.zecko.retailer.common.pojo.price.PriceRange;
import co.zecko.retailer.common.pojo.reviews.ReviewItems;
import co.zecko.retailer.common.pojo.variant.VariantEdges;
import co.zecko.retailer.common.util.DiscountUtil;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Product extends BaseEntry implements Serializable {

    private static final long serialVersionUID = -1878780115434615038L;

    String description;

    Image featuredImage;

    String handle;

    Boolean hasOnlyDefaultVariant;

    Boolean hasOutOfStockVariants;

    String id;

    ImageEdges images;

    List<ProductOption> options;

    PriceRange priceRangeV2;

    // first variant price and compareAtPrice
    String price;

    String compareAtPrice;

    String discountPercentage;

    List<Platform> platforms;

    String productType;

    ProductStatus status;

    List<String> tags;

    String title;

    String rating;

    String noOfRatings;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    Integer totalInventory;

    Integer totalVariants;

    VariantEdges variants;

    String vendor;

    MetaFieldEdges metafields;

    PostOrderProductData postOrderProductData;

    ReviewItems reviews;

    Boolean isAvailable;

    public String getDiscountPercentage() {
        return DiscountUtil.getDiscountPercentage(getPrice(), getCompareAtPrice());
    }

    public Boolean getIsAvailable() {
        if(totalInventory == null) return null;
        this.isAvailable =  totalInventory > 0;
        return this.isAvailable;
    }
}
