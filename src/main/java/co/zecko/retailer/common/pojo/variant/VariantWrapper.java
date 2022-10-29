package co.zecko.retailer.common.pojo.variant;

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
public class VariantWrapper implements Serializable {

    private static final long serialVersionUID = 1748386206650723855L;

    Variant variant;
}
