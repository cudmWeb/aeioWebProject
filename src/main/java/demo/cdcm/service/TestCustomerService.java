package demo.cdcm.service;

import demo.cdcm.model.TestTable;
import demo.cdcm.repository.TestCustomerRepository;
import demo.cdcm.request.TestCustomerRequest;
import demo.cdcm.web.rest.CustomerDataController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestCustomerService {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerDataController.class);
    @Autowired
    private TestCustomerRepository testCustomerRepository;

    public void createTestCustomer(TestCustomerRequest request){
        TestTable testTable = new TestTable();
        LOG.info("log here: {}", request.getCustomerName());
        testTable.setCustomerName(request.getCustomerName());
        testTable.setOccupation(request.getOccupation());
        testTable.setAge(request.getAge());
        testCustomerRepository.save(testTable);
    }

    public List<TestTable> findAll() {
        return testCustomerRepository.findAll();
    }
}
