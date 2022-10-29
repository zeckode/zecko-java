package co.zecko.retailer.common.pojo.metaField;

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
public class MetaFieldEdge implements Serializable {

    private static final long serialVersionUID = 5795928211085356998L;

    String cursor;

    MetaField node;
}
