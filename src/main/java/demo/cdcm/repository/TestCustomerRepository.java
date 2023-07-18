package demo.cdcm.repository;

import demo.cdcm.model.TestTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestCustomerRepository extends JpaRepository<TestTable, Integer> {

}
