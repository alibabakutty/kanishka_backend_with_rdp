package kanishka.purchase_order.accounting_master.service;

import kanishka.purchase_order.accounting_master.dto.api_side.AccountingMasterRequest;
import kanishka.purchase_order.accounting_master.dto.response_side.AccountingMasterResponse;
import kanishka.purchase_order.accounting_master.dto.tally_json.AccountingMasterWrapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AccountingMasterService {

    @Transactional
    AccountingMasterResponse createAccountingMaster(AccountingMasterRequest request);

    @Transactional
    void saveAllFromTally(AccountingMasterWrapper wrapper);

    AccountingMasterResponse getByIdAccountingMaster(Long id);

    List<AccountingMasterResponse> getAllAccountingMaster();

    AccountingMasterResponse updateAccountingMaster(Long id, AccountingMasterRequest request);

    @Transactional
    void  deleteByIdAccountingMaster(Long id);
}
