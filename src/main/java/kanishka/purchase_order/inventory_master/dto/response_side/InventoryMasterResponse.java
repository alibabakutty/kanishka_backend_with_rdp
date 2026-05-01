package kanishka.purchase_order.inventory_master.dto.response_side;

public record InventoryMasterResponse(
        Long id,
        String itemName,
        String uom
) {
}
