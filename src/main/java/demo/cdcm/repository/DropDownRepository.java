package demo.cdcm.repository;

import demo.cdcm.model.DropDowns;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DropDownRepository extends JpaRepository<DropDowns, Integer> {


}
