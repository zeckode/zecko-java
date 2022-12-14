package co.zecko.retailer.common.pojo.customer;

import co.zecko.retailer.common.pojo.UserError;

import java.io.Serializable;
import java.util.List;

import co.zecko.commonPublic.java.pojo.BaseEntry;
import com.fasterxml.jackson.annotation.JsonInclude;
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
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerWrapper extends BaseEntry implements Serializable {

    private static final long serialVersionUID = -5261643984122440247L;

    Customer customer;

    List<UserError> userErrors;
}
