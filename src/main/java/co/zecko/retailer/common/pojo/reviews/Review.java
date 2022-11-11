package co.zecko.retailer.common.pojo.reviews;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Review implements Serializable {

    private static final long serialVersionUID = -3158450223299447644L;

    String authorName;
    
    Float rating;

    String summary;

    String body;
 }
