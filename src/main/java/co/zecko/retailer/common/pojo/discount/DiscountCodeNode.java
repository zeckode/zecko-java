package co.zecko.retailer.common.pojo.discount;

import co.zecko.retailer.common.enums.DiscountCodeNodeType;
import co.zecko.common.java.pojo.BaseEntry;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import java.io.Serializable;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(use = Id.NAME, property = "__typename", visible = true)
@JsonSubTypes({@JsonSubTypes.Type(value = DiscountCodeBasic.class, name = "DiscountCodeBasic")})
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class DiscountCodeNode extends BaseEntry implements Serializable {

    private static final long serialVersionUID = -6779969066981019635L;

    DiscountCodeNodeType __typename;
}
