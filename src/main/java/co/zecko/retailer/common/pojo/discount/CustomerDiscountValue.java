package co.zecko.retailer.common.pojo.discount;

import co.zecko.retailer.common.enums.CustomerDiscountValueType;
import co.zecko.common.java.pojo.BaseEntry;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(use = Id.NAME, property = "__typename", visible = true)
@JsonSubTypes({@JsonSubTypes.Type(value = DiscountPercentage.class, name = "DiscountPercentage")})
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class CustomerDiscountValue extends BaseEntry implements Serializable {

    private static final long serialVersionUID = -1961148040375930784L;

    CustomerDiscountValueType __typename;

}
