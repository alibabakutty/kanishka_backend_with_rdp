package kanishka.purchase_order.purchase_order.controller;

import kanishka.purchase_order.purchase_order.dto.PurchaseOrderRequest;
import kanishka.purchase_order.purchase_order.dto.PurchaseOrderResponse;
import kanishka.purchase_order.purchase_order.service.PurchaseOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/v1/purchase-orders")
@RequiredArgsConstructor
public class PurchaseOrderController {

    private final PurchaseOrderService service;

    @PostMapping
    public ResponseEntity<PurchaseOrderResponse> create(@RequestBody PurchaseOrderRequest request) {
        PurchaseOrderResponse response = service.create(request);
        return ResponseEntity.status(201).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PurchaseOrderResponse> getById(@PathVariable Long id){
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<PurchaseOrderResponse>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<PurchaseOrderResponse> update(@PathVariable Long id, @RequestBody PurchaseOrderRequest request){
        return ResponseEntity.ok(service.update(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
