package pl.jakusz.credit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.jakusz.credit.model.Credit;
import pl.jakusz.credit.model.Customer;

import java.math.BigDecimal;

@SpringBootApplication
public class CreditApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreditApplication.class, args);
    }

}
