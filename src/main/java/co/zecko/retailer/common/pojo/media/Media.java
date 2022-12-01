package co.zecko.retailer.common.pojo.media;

import co.zecko.retailer.common.enums.MediaContentType;
import co.zecko.retailer.common.enums.MediaStatus;
import co.zecko.commonPublic.java.pojo.BaseEntry;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

// TODO: test with video

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Media extends BaseEntry implements Serializable {

    private static final long serialVersionUID = 3407184132272438525L;

    String alt;

    MediaContentType mediaContentType;

    MediaPreview preview;

    MediaStatus status;
}
