package kanishka.purchase_order.accounting_master.converter;

import kanishka.purchase_order.accounting_master.dto.api_side.AccountingMasterRequest;
import kanishka.purchase_order.accounting_master.dto.tally_json.AccountingMasterWrapper;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class AccountingMasterConverter {

    // tally json ->  main dto
    public List<AccountingMasterRequest> fromTallyJson(AccountingMasterWrapper wrapper) {
        // Handle null or empty cases safely
        if (wrapper == null || wrapper.getAccountingMasters() == null) {
            return List.of();
        }

        // Map the list of InnerDtos to a list of AccountingMasterRequests
        return wrapper.getAccountingMasters().stream()
                .map(dto -> new AccountingMasterRequest(
                        dto.sundryCreditorName(),
                        dto.parentName(),
                        dto.grandParentName()
                ))
                .collect(Collectors.toList());
    }
}
