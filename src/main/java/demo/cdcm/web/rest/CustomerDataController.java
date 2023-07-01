package demo.cdcm.web.rest;

import demo.cdcm.request.TestCustomerRequest;
import demo.cdcm.service.TestCustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/customer")
public class CustomerDataController {

    @Autowired
    private TestCustomerService testCustomerService;
    private static final Logger LOG = LoggerFactory.getLogger(CustomerDataController.class);

    @PostMapping(value = "/create")
    public String createCustomer(){

        LOG.info("record created");
        return "success";
    }

    @PostMapping(value = "/test_create")
    public ResponseEntity<?> createTestCustomer(@RequestBody TestCustomerRequest request){
        LOG.info("Enter createTestCustomer");
        testCustomerService.createTestCustomer(request);
        LOG.info("Record created");
        return ResponseEntity.ok(testCustomerService.findAll());
    }
}
