package demo.cdcm.repository;

import demo.cdcm.model.CustomerData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDataRepository extends JpaRepository<CustomerData, Integer> {

}
