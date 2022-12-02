package co.zecko.retailer.common.pojo.money;

import co.zecko.commonPublic.java.pojo.BaseEntry;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;
import java.util.Date;
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
public class Refund extends BaseEntry implements Serializable {

    private static final long serialVersionUID = 8789532304878719808L;

    Date createdAt;

    String id;

    String note;

    MoneyBag totalRefundedSet;

    Date updatedAt;
}
