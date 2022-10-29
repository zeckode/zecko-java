package co.zecko.retailer.common.pojo;

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
public class SelectedOption implements Serializable {

    private static final long serialVersionUID = -5979764827467598410L;

    String name;

    String value;
}
