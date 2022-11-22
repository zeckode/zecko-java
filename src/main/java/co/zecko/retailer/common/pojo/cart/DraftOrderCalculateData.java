package co.zecko.retailer.common.pojo.cart;

import co.zecko.common.java.pojo.BaseEntry;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DraftOrderCalculateData extends BaseEntry implements Serializable {

    private static final long serialVersionUID = -8993029785587804468L;

    DraftOrderCalculateWrapper data;
}
