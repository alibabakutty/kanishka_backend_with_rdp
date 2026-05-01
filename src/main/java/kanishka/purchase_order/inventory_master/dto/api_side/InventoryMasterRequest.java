package kanishka.purchase_order.inventory_master.dto.api_side;

import jakarta.validation.constraints.NotBlank;

public record InventoryMasterRequest(
        @NotBlank String itemName,
        String uom
) {
}
