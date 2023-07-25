package demo.cdcm.web.rest;

import demo.cdcm.dto.CustomerBaseDataDTO;
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
import java.util.Map;

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


    /**
     *  Fetch only base data required to show records in UI
     *
     * @return List<CustomerBaseDataDTO>
     */
    @GetMapping(value = "/getCustomers")
    public List<CustomerBaseDataDTO> getCustomers(){
        return customerService.getCustomers();
    }

    /**
     * Controller to return all customer details available
     *
     * @return List<CustomerDataResponse>
     */
    @GetMapping(value = "/getAllCustomers")
    public List<CustomerDataResponse> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping(value = "/drop_downs")
    public ResponseEntity<?> getAllDropDowns(){
        return ResponseEntity.ok(dropDownService.geAllDropDownData());
    }

    @GetMapping
    public ResponseEntity<?> search(@RequestParam int id){
        return ResponseEntity.ok(customerService.searchCustomer(id));
    }

    @RequestMapping(value = "/{id}", method=RequestMethod.GET)
    public CustomerDataResponse searchV1(@PathVariable("id") int id){
        return customerService.searchCustomer(id);
    }

    @RequestMapping(value = "/searchByCustomerId", method=RequestMethod.POST)
    public CustomerDataResponse searchByCustomerId(@RequestBody  Map<String, String> request){
        return customerService.getCustomerDetails(request);
    }

    @RequestMapping(value = "/searchByCustomerId/{customerId}", method=RequestMethod.GET)
    public CustomerDataResponse searchByCustomerIdV1(@PathVariable("customerId") String customerId){
        return customerService.findByByCustomerId(customerId);
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
