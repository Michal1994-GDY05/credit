package pl.jakusz.credit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.jakusz.credit.model.Credit;

@Repository
public interface CreditRepo extends JpaRepository<Credit, Long> {

}
