package kanishka.purchase_order.inventory_master.dto.api_side;

import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;

public record InventoryMasterRequest(
        @NotBlank String itemName,
        String itemUom,
        String hsnCode,
        BigDecimal gstPercentage,
        BigDecimal itemRate
) {
}
