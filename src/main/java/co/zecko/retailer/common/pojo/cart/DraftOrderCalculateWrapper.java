package co.zecko.retailer.common.pojo.cart;

import co.zecko.retailer.common.pojo.base.BaseEntry;
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
public class DraftOrderCalculateWrapper extends BaseEntry implements Serializable {

    private static final long serialVersionUID = 5054406414569087080L;

    DraftOrderCalculate draftOrderCalculate;
}
