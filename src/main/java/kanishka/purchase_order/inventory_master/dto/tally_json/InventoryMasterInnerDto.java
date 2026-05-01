package kanishka.purchase_order.inventory_master.dto.tally_json;

import com.fasterxml.jackson.annotation.JsonProperty;

public record InventoryMasterInnerDto(
        @JsonProperty("name")
        String itemName,

        @JsonProperty("baseunits")
        String uom
) {
}
