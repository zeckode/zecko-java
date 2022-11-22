package co.zecko.retailer.common.pojo.cart;

import co.zecko.retailer.common.pojo.UserError;

import java.util.List;

import co.zecko.common.java.pojo.BaseEntry;
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
public class DraftOrderDeletedIdWrapper extends BaseEntry {

    private static final long serialVersionUID = -88194707514022032L;

    String deletedId;

    List<UserError> userErrors;
}
