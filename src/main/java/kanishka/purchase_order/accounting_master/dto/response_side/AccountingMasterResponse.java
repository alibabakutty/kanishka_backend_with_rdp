package kanishka.purchase_order.accounting_master.dto.response_side;

public record AccountingMasterResponse(
        Long id,
        String sundryCreditorName,
        String parentName,
        String grandParentName
) {
}
