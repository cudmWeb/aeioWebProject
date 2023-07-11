package demo.cdcm.service;

import demo.cdcm.model.CustomerData;
import demo.cdcm.repository.CustomerDataRepository;
import demo.cdcm.request.CustomerDataRequest;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class CustomerService {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerService.class);

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CustomerDataRepository customerDataRepository;

    public void createCustomerData(CustomerDataRequest request){

//        CustomerCreateDTO createDTO = modelMapper.map(request, CustomerCreateDTO.class);
//        CustomerData data = modelMapper.map(createDTO, CustomerData.class);
//        data.setCustomerId(UUID.randomUUID().toString());
//        customerDataRepository.save(data);

        createCustomer(request);


        LOG.info("request reached : {}", request.toString());
    }

    public ModelMapper setModelMapper(ModelMapper modelMapper) {
        ModelMapper mm = new ModelMapper();
        mm.getConfiguration().setAmbiguityIgnored(true);
        return mm;
    }

    @Transactional
    private void createCustomer(CustomerDataRequest request) {
        CustomerData data = new CustomerData();
        data.setCustomerId(UUID.randomUUID().toString());
        data.setNAICSCode(request.getNaicsCode());

        data.setCustomerAcronym(request.getCustomerAcronym());
        data.setCustomerName(request.getCustomerName());
        data.setCustomerGender(request.getCustomerGender());
        data.setCustomerTIN(request.getCustomerTIN());
        data.setAccountMandateIdNumber(request.getAccountMandateIdNumber());
        data.setAccountMandateIdType(request.getAccountMandateIdType());
        data.setAccountMandateName(request.getAccountMandateName());
        data.setAccountOfficer(request.getAccountOfficer());
        data.setCommAddress1(request.getCommAddress1());
        data.setCommCountry(request.getCommCountry());
        data.setCommVillage(request.getCommVillage());
        data.setCustomerStatus(request.getCustomerStatus());
        data.setDateOfBirth(request.getDateOfBirth());
        data.setEducation(request.getEducation());
        data.setEmailId(request.getEmailId());
        data.setEmployeeID(request.getEmployeeID());
        data.setEmployerName(request.getEmployerName());
        data.setHealthInsuranceNumber(request.getHealthInsuranceNumber());
        data.setSalutation(request.getSalutation());
        customerDataRepository.save(data);

    }

    public List<CustomerData> getCustomers() {
        return customerDataRepository.findAll();
    }
}
