package co.zecko.retailer.common.pojo.InventoryUnitHistory;

import co.zecko.common.java.pojo.BaseDataBaseEntry;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InventoryUnitHistoryWrapper extends BaseDataBaseEntry implements Serializable {

    private static final long serialVersionUID = -442616495729170935L;

    List<InventoryUnitHistoryEntry> history;
}
