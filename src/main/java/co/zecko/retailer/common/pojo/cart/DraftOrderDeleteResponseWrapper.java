package co.zecko.retailer.common.pojo.cart;

import co.zecko.retailer.common.pojo.base.BaseEntry;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
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
public class DraftOrderDeleteResponseWrapper extends BaseEntry {

    private static final long serialVersionUID = -7745227653888192029L;

    DraftOrderDeletedIdWrapperWrapper data;
}
