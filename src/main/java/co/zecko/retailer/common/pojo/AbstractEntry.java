package co.zecko.retailer.common.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class AbstractEntry<ID extends Serializable> implements Serializable {


    private static final long serialVersionUID = -629022149247943169L;

    ID id;

    private Date createdAt;

    private Date updatedAt;

    private String createdBy;
}