package co.zecko.retailer.common.pojo.money;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MoneyBag {

    private static final long serialVersionUID = 4667312934910682620L;

    Money presentmentMoney;

    Money shopMoney;
}
