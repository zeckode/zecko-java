package co.zecko.retailer.common.pojo;

import co.zecko.common.java.pojo.BaseEntry;
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
public class PaginationParams extends BaseEntry implements Serializable {

    private static final long serialVersionUID = -6338096984232130987L;

    String before;

    String after;

    String imagesBefore;

    String imagesAfter;

    String variantsBefore;

    String variantsAfter;

    String lineItemsBefore;

    String lineItemsAfter;

    String metaFieldsBefore;

    String metaFieldsAfter;
}
