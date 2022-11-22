package co.zecko.retailer.common.pojo.customer;

import co.zecko.common.java.pojo.BaseEntry;
import com.fasterxml.jackson.annotation.JsonInclude;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomersData extends BaseEntry implements Serializable {

    private static final long serialVersionUID = -4997857115973857104L;

    CustomerEdgesWrapper data;
}
