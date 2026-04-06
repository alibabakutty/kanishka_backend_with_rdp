package kanishka.purchase_order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PurchaseOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(PurchaseOrderApplication.class, args);
	}

}
