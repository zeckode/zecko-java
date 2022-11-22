package co.zecko.retailer.common.pojo.collection;

import co.zecko.common.java.pojo.BaseEntry;
import co.zecko.retailer.common.pojo.image.Image;
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
public class Collection extends BaseEntry implements Serializable {

    private static final long serialVersionUID = 2452827153774020429L;

    String id;

    String description;

    String handle;

    Image image;

    Integer productsCount;

    String title;
}
