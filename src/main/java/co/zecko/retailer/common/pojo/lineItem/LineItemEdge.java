package co.zecko.retailer.common.pojo.lineItem;

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
public class LineItemEdge implements Serializable {

    private static final long serialVersionUID = 8002022434702068095L;

    String cursor;

    LineItem node;
}
