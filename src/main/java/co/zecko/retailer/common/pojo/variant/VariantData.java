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
public class VariantData implements Serializable {

    private static final long serialVersionUID = -1078487148449755099L;

    VariantWrapper data;
}
