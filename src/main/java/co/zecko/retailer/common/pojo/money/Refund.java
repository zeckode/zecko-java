package co.zecko.retailer.common.pojo.money;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Refund implements Serializable {

    private static final long serialVersionUID = 8789532304878719808L;

    Date createdAt;

    String id;

    String note;

    MoneyBag totalRefundedSet;

    Date updatedAt;
}
