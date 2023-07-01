package demo.cdcm.service;

import demo.cdcm.model.TestCustomer;
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
        TestCustomer testCustomer = new TestCustomer();
        LOG.info("log here: {}", request.getCustomerName());
        testCustomer.setCustomerName(request.getCustomerName());
        testCustomer.setOccupation(request.getOccupation());
        testCustomer.setAge(request.getAge());
        testCustomerRepository.save(testCustomer);
    }

    public List<TestCustomer> findAll() {
        return testCustomerRepository.findAll();
    }
}
