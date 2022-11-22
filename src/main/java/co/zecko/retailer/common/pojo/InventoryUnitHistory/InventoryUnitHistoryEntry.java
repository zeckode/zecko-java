package co.zecko.retailer.common.pojo.InventoryUnitHistory;

import java.util.Date;

import co.zecko.common.java.pojo.BaseDataBaseEntry;
import co.zecko.retailer.common.enums.InventoryUnitStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InventoryUnitHistoryEntry extends BaseDataBaseEntry {

    private static final long serialVersionUID = -6432257902574782255L;

    Long inventoryUnitId;

    InventoryUnitStatus status;

    String cancelReason;

    String returnReason;

    String exchangeReason;

    Date occurredAt;
    public InventoryUnitHistoryEntry(Long inventoryUnitId, Date occurredAt) {
        this.inventoryUnitId = inventoryUnitId;
        this.occurredAt = occurredAt;
        this.status = InventoryUnitStatus.CREATED;
    }

    public InventoryUnitHistoryEntry(Long inventoryUnitId, InventoryUnitStatus status, Date occurredAt) {
        this.inventoryUnitId = inventoryUnitId;
        this.status = status;
        this.occurredAt = occurredAt;
    }
}
