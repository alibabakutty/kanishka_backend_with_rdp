package kanishka.purchase_order.accounting_master.dto.api_side;

import jakarta.validation.constraints.NotBlank;

public record AccountingMasterRequest(
        @NotBlank String sundryCreditorName,
        String parentName,
        String grandParentName
) {
}
