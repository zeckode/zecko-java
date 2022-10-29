package co.zecko.retailer.common.pojo.platform;

import co.zecko.retailer.common.enums.PlatFormTitle;
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
public class Platform implements Serializable {

    private static final long serialVersionUID = -376702133819280260L;

    PlatFormTitle title;

    String price;
}
