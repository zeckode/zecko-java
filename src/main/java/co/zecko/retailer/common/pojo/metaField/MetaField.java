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
public class MetaField implements Serializable {

    private static final long serialVersionUID = -630531775565344354L;

    String description;

    String key;

    String namespace;

    String type;

    String value;
}
