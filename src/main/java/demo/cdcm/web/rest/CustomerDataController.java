package demo.cdcm.web.rest;

import demo.cdcm.request.CustomerDataRequest;
import demo.cdcm.request.TestCustomerRequest;
import demo.cdcm.response.CustomerDataResponse;
import demo.cdcm.service.CustomerService;
import demo.cdcm.service.DropDownService;
import demo.cdcm.service.TestCustomerService;
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
    @Autowired
    private DropDownService dropDownService;
    private static final Logger LOG = LoggerFactory.getLogger(CustomerDataController.class);

    @PostMapping(value = "/create")
    public ResponseEntity<?> createCustomer(@RequestBody CustomerDataRequest request){
        LOG.info("Enter createTestCustomer");
        customerService.createCustomerData(request);
        LOG.info("Record created");
        return ResponseEntity.ok().body("Successfully created customer");
    }

    @GetMapping(value = "/getCustomers")
    public List<CustomerDataResponse> getCustomers(){
        return customerService.getCustomers();
    }

    @GetMapping
    public ResponseEntity<?> search(@RequestParam int id){
        return ResponseEntity.ok(customerService.searchCustomer(id));
    }

    @GetMapping(value = "/drop_downs")
    public ResponseEntity<?> getAllDropDowns(){
        return ResponseEntity.ok(dropDownService.geAllDropDownData());
    }

    @RequestMapping(value = "/{id}", method=RequestMethod.GET)
    public CustomerDataResponse searchV1(@PathVariable("id") int id){
       return customerService.searchCustomer(id);
    }

    @PostMapping(value = "/test_create")
    public ResponseEntity<?> createTestCustomer(@RequestBody TestCustomerRequest request){

        testCustomerService.createTestCustomer(request);
        LOG.info("Record created");
        return ResponseEntity.ok(testCustomerService.findAll());
    }

    @GetMapping(value = "/test")
    public String testHealth(){
        return "Application is up and running";
    }
}
