package co.zecko.retailer.common.pojo.collection;

import co.zecko.commonPublic.java.pojo.BaseEntry;
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
public class CollectionsData extends BaseEntry implements Serializable {

    private static final long serialVersionUID = 8083917811627800981L;

    CollectionEdgesWrapper data;
}
