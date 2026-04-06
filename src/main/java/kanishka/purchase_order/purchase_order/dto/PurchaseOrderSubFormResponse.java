package kanishka.purchase_order.purchase_order.dto;

import java.math.BigDecimal;

public record PurchaseOrderSubFormResponse(
        Long id,
        String itemName,
        String itemUom,
        BigDecimal billedQty,
        BigDecimal itemRate,
        BigDecimal itemAmount
) {
}
