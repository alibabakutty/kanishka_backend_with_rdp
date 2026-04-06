package kanishka.purchase_order.purchase_order.repository;

import kanishka.purchase_order.purchase_order.module.PurchaseOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrderEntity, Long> {

    // find all
    List<PurchaseOrderEntity>findByOrderNumber(String orderNumber);
    // check if order number exists
    boolean existsByOrderNumber(String orderNumber);
}
