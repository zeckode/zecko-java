package co.zecko.retailer.common.pojo.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@ToString
@JsonInclude(Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class BaseEntry implements Serializable {

    private static final long serialVersionUID = 1166608276332260653L;

    List<ErrorEntry> errors;

    String message;

    Date timestamp;
}
