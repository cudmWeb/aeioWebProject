package demo.cdcm.web.rest;

import demo.cdcm.model.CustomerData;
import demo.cdcm.request.CustomerDataRequest;
import demo.cdcm.request.TestCustomerRequest;
import demo.cdcm.service.CustomerService;
import demo.cdcm.service.TestCustomerService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerDataController {

    @Autowired
    private TestCustomerService testCustomerService;
    @Autowired
    private CustomerService customerService;
    private static final Logger LOG = LoggerFactory.getLogger(CustomerDataController.class);

    @GetMapping(value = "/create")
    public String createGetCustomer(){
        LOG.info("record created");
        return "success";
    }

    @PostMapping(value = "/create")
    public ResponseEntity<?> createCustomer(@RequestBody CustomerDataRequest request){
        LOG.info("Enter createTestCustomer");
        customerService.createCustomerData(request);
        LOG.info("Record created");
        return ResponseEntity.ok().body("Successfully created customer");
    }

    @GetMapping(value = "/getCustomers")
    public List<CustomerData> getCustomers(){
        //LOG.info("Enter createTestCustomer");
        //LOG.info("Record created");
        //return ResponseEntity.ok().body(customerService.getCustomers());
        return customerService.getCustomers();

    }

    @PostMapping(value = "/test_create")
    public ResponseEntity<?> createTestCustomer(@RequestBody TestCustomerRequest request){
        LOG.info("Enter createTestCustomer");
        testCustomerService.createTestCustomer(request);
        LOG.info("Record created");
        return ResponseEntity.ok(testCustomerService.findAll());
    }
}
