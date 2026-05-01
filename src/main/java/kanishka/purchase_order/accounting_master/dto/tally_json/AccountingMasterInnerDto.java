package kanishka.purchase_order.accounting_master.dto.tally_json;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AccountingMasterInnerDto(
        @JsonProperty("name")
        String sundryCreditorName,

        @JsonProperty("parent")
        String parentName,

        @JsonProperty("grandparent")
        String grandParentName
) {
}
