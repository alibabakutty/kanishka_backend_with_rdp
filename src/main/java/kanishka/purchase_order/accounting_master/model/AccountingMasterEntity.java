package kanishka.purchase_order.accounting_master.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "accounting_master")
public class AccountingMasterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "accounting_master_seq")
    @SequenceGenerator(name = "accounting_master_seq", sequenceName = "accounting_master_sequence", allocationSize = 50)
    private Long id;

    @Column(unique = true)
    private String superKey;
}
