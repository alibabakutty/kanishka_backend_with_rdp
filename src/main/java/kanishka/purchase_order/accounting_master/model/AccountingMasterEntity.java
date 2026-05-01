package kanishka.purchase_order.accounting_master.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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

    @NotBlank(message = "Sundry Creditor Name is required")
    @Column(name = "sundry_creditor_name", nullable = false)
    private String sundryCreditorName;

    @Column(name = "parent")
    private String parentName;

    @Column(name = "grand_parent")
    private String grandParentName;
}
