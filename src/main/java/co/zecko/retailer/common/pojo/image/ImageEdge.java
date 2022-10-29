package co.zecko.retailer.common.pojo.image;

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
public class ImageEdge implements Serializable {

    private static final long serialVersionUID = -6614890663087882838L;

    String cursor;

    Image node;
}
