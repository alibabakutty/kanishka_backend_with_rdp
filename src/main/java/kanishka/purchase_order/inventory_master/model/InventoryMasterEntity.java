package kanishka.purchase_order.inventory_master.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "inventory_master")
public class InventoryMasterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inventory_master_seq")
    @SequenceGenerator(name = "inventory_master_seq", sequenceName = "inventory_master_Sequence", allocationSize = 50)
    private Long id;

    @NotBlank(message = "Item name is required")
    @Column(name = "item_name", nullable = false)
    private String itemName;

    @Column(name = "uom", nullable = false)
    private String uom;
}
