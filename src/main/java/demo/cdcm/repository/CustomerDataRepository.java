package demo.cdcm.repository;

import demo.cdcm.model.CustomerData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDataRepository extends JpaRepository<CustomerData, Integer> {

    @Query(value = "SELECT c FROM CustomerData c WHERE c.customerId = ?1")
    CustomerData findByCustomerId(String customerId);

}
