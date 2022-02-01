package pl.jakusz.credit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.jakusz.credit.model.Customer;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

    Optional<Customer> findByPesel(String pesel);

}
