package demo.cdcm.service;

import demo.cdcm.dto.CustomerBaseDataDTO;
import demo.cdcm.model.CustomerData;
import demo.cdcm.repository.CustomerDataRepository;
import demo.cdcm.request.CustomerDataRequest;
import demo.cdcm.request.UpdateStatusRequest;
import demo.cdcm.response.CustomerDataResponse;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.SecureRandom;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerService.class);

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CustomerDataRepository customerDataRepository;

    @Value("${customer.id.fetch}")
    private String uniqueId;

    public void createCustomerData(CustomerDataRequest request) throws Exception{
        LOG.info("Enter createCustomerData");
        CustomerData data = new CustomerData();
        customerDataRepository.save(createCustomer(request, data));
        LOG.info("request reached : {}", request.toString());
    }

    public ModelMapper setModelMapper(ModelMapper modelMapper) {
        ModelMapper mm = new ModelMapper();
        mm.getConfiguration().setAmbiguityIgnored(true);
        return mm;
    }

    public CustomerData createCustomer(CustomerDataRequest request, CustomerData data) {

        data.setAccountMandateIdNumber(request.getAccountMandateIdNumber());
        data.setAccountMandateIdType(request.getAccountMandateIdType());
        data.setAccountMandateName(request.getAccountMandateName());
        data.setAccountOfficer(request.getAccountOfficer());

        if (null == request.getCustomerId()){
            data.setCustomerId(getRandomUid(uniqueId));
        }

        data.setCommAddress1(request.getCommAddress1());
        data.setCommAddress2(request.getCommAddress2());
        data.setCommCountry(request.getCommCountry());
        data.setCommResidenceType(request.getCommResidenceType());
        data.setCommVillage(request.getCommVillage());
        data.setCustomerAcronym(request.getCustomerAcronym());
        data.setCustomerGender(request.getCustomerGender());
        data.setCustomerName(request.getCustomerName());
        data.setCustomerOpenDate(request.getCustomerOpenDate());
        data.setCustomerStatus(request.getCustomerStatus());
        data.setCustomerTIN(request.getCustomerTIN());

        data.setDateLastModified(request.getDateLastModified());
        data.setDateOfBirth(request.getDateOfBirth());

        data.setEconomicSubSectorCodeISIC(request.getEconomicSubSectorCodeISIC());
        data.setEducation(request.getEducation());
        data.setEmailId(request.getEmailId());
        data.setEmpAddress1(request.getEmpAddress1());
        data.setEmpAddress2(request.getEmpAddress2());
        data.setEmpCountry(request.getEmpCountry());
        data.setEmpVillage(request.getEmpVillage());
        data.setEmployeeID(request.getEmployeeID());
        data.setEmployerName(request.getEmployerName());
        data.setFaxNumber1(request.getFaxNumber1());
        data.setFaxNumber2(request.getFaxNumber2());
        data.setForename1(request.getForename1());
        data.setForename2(request.getForename2());
        data.setGroupName(request.getGroupName());
        data.setGroupNumber(request.getGroupNumber());
        data.setHealthInsuranceNumber(request.getHealthInsuranceNumber());
        data.setHomeTelephone(request.getHomeTelephone());
        data.setIncome(request.getIncome());
        data.setIncomeFrequency(request.getIncomeFrequency());
        data.setInternetBankingSubscription(request.getInternetBankingSubscription());
        data.setLegalStatus(request.getLegalStatus());
        data.setLocalGovtMember(request.getLocalGovtMember());
        data.setMaritalStatus(request.getMaritalStatus());
        data.setMobileBankingSubscription(request.getMobileBankingSubscription());
        data.setNAICSCode(request.getNaicsCode());
        data.setNationalIDNumber(request.getNationalIDNumber());
        data.setNationalIDType(request.getNationalIDType());
        data.setNationality(request.getNationality());
        data.setNextOfKinEmailId(request.getNextOfKinEmailId());
        data.setNextOfKinIdNumber(request.getNextOfKinIdNumber());
        data.setNextOfKinIdType(request.getNextOfKinIDType());
        data.setNextOfKinName(request.getNextOfKinName());
        data.setNextOfKinTelephone(request.getNextOfKinTelephone());
        data.setNumberOfDependants(request.getNumberOfDependants());
        data.setOccupation(request.getOccupation());
        data.setPermAddress1(request.getEmpAddress1());
        data.setPermAddress2(request.getPermAddress2());
        data.setPermCountry(request.getPermCountry());
        data.setPermVillage(request.getPermVillage());
        data.setPlaceOfBirth(request.getPlaceOfBirth());
        data.setRelatedParty(request.getRelatedParty());
        data.setRelatedPartyName(request.getRelatedPartyName());
        data.setRelationshipType(request.getRelationshipType());
        data.setResidence(request.getResidence());
        data.setSalutation(request.getSalutation());

        data.setSocialEconomicClass(request.getSocialEconomicClass());
        data.setSpouseName(request.getSpouseName());
        data.setSsnNumber(request.getSsnNumber());
        data.setSurname(request.getSurname());
        data.setVisionOUC(request.getVisionOUC());
        data.setVisionSBU(request.getVisionSBU());
        data.setWorkTelephone(request.getWorkTelephone());
        data.setApprovalStatus("PENDING");//PENDING, APPROVED, REJECTED

        return data;

    }

    public List<CustomerBaseDataDTO> getCustomers() {
        List<CustomerData> data = customerDataRepository.findAll();
        ModelMapper modelMapper = new ModelMapper();
        return data.stream()
                .map(user -> modelMapper.map(user, CustomerBaseDataDTO.class))
                .collect(Collectors.toList());
    }

    public List<CustomerBaseDataDTO> getApprovalPendingCustomers() {
        //PENDING, APPROVED, REJECTED
        List<CustomerData> data = customerDataRepository.findApprovalPendingCustomers("PENDING");
        ModelMapper modelMapper = new ModelMapper();
        return data.stream()
                .map(user -> modelMapper.map(user, CustomerBaseDataDTO.class))
                .collect(Collectors.toList());
    }

    public List<CustomerDataResponse> getAllCustomers() {
        List<CustomerData> users = customerDataRepository.findAll();
        ModelMapper modelMapper = new ModelMapper();
        return users.stream()
                .map(user -> modelMapper.map(user, CustomerDataResponse.class))
                .collect(Collectors.toList());
    }

    private String getRandomUid(String uniqueId) {

        Random random = new SecureRandom();
        int rand = random.nextInt();
        LOG.info("uniqueId: {} , randomId: {} ", uniqueId, rand);
        return (uniqueId + String.valueOf(rand));
    }

    public CustomerDataResponse searchCustomer(int id) throws Exception {
        CustomerData data =  customerDataRepository.findById(id).get();
        return createCustomerDataResponse(data);
     }

    public CustomerDataResponse findByByCustomerId(String customerId) throws Exception {
        LOG.info("Customer ID: {}",customerId);
        CustomerData data =  customerDataRepository.findByCustomerId(customerId);
        return createCustomerDataResponse(data);
    }

    private CustomerDataResponse createCustomerDataResponse(CustomerData data) throws Exception{

        if (null == data){
            throw new RuntimeException("No Data Found");
        }
        CustomerDataResponse res = new CustomerDataResponse();

        res.setCustomerId(data.getCustomerId());
        res.setSalutation(data.getSalutation());
        res.setCustomerName(data.getCustomerName());
        res.setSurname(data.getSurname());
        res.setForename1(data.getForename1());
        res.setForename2(data.getForename2());
        res.setCustomerAcronym(data.getCustomerAcronym());
        res.setVisionOUC(data.getVisionOUC());
        res.setVisionSBU(data.getVisionSBU());
        res.setAccountOfficer(data.getAccountOfficer());
        res.setCustomerOpenDate(data.getCustomerOpenDate());
        res.setCustomerGender(data.getCustomerGender());
        res.setDateOfBirth(data.getDateOfBirth());
        res.setPlaceOfBirth(data.getPlaceOfBirth());
        res.setMaritalStatus(data.getMaritalStatus());
        res.setSpouseName(data.getSpouseName());
        res.setSocialEconomicClass(data.getSocialEconomicClass());
        res.setNextOfKinName(data.getNextOfKinName());
        res.setNextOfKinIDType(data.getNextOfKinIdType());
        res.setNextOfKinIdNumber(data.getNextOfKinIdNumber());
        res.setNextOfKinTelephone(data.getNextOfKinTelephone());
        res.setNextOfKinEmailId(data.getNextOfKinEmailId());
        res.setNumberOfDependants(data.getNumberOfDependants());
        res.setAccountMandateName(data.getAccountMandateName());
        res.setAccountMandateIdType(data.getAccountMandateIdType());
        res.setAccountMandateIdNumber(data.getAccountMandateIdNumber());
        res.setNationality(data.getNationality());
        res.setResidence(data.getResidence());
        res.setCommAddress1(data.getCommAddress1());
        res.setCommAddress2(data.getCommAddress2());
        res.setCommVillage(data.getCommVillage());
        res.setCommCountry(data.getCommCountry());
        res.setCommResidenceType(data.getCommResidenceType());
        res.setPermAddress1(data.getPermAddress1());
        res.setPermAddress2(data.getPermAddress2());
        res.setPermVillage(data.getPermVillage());
        res.setPermCountry(data.getPermCountry());
        res.setEmailId(data.getEmailId());
        res.setWorkTelephone(data.getWorkTelephone());
        res.setHomeTelephone(data.getHomeTelephone());
        res.setFaxNumber1(data.getFaxNumber1());
        res.setFaxNumber2(data.getFaxNumber2());
        res.setEducation(data.getEducation());
        res.setCustomerTIN(data.getCustomerTIN());
        res.setNaicsCode(data.getNAICSCode());
        res.setEconomicSubSectorCodeISIC(data.getEconomicSubSectorCodeISIC());
        res.setRelatedParty(data.getRelatedParty());
        res.setRelationshipType(data.getRelationshipType());
        res.setRelatedPartyName(data.getRelatedPartyName());
        res.setLocalGovtMember(data.getLocalGovtMember());
        res.setInternetBankingSubscription(data.getInternetBankingSubscription());
        res.setMobileBankingSubscription(data.getMobileBankingSubscription());
        res.setSsnNumber(data.getSsnNumber());
        res.setNationalIDType(data.getNationalIDType());
        res.setNationalIDNumber(data.getNationalIDNumber());
        res.setHealthInsuranceNumber(data.getHealthInsuranceNumber());
        res.setOccupation(data.getOccupation());
        res.setEmployerName(data.getEmployerName());
        res.setEmployeeID(data.getEmployeeID());
        res.setEmpAddress1(data.getEmpAddress1());
        res.setEmpAddress2(data.getEmpAddress2());
        res.setEmpVillage(data.getEmpVillage());
        res.setEmpCountry(data.getEmpCountry());
        res.setIncome(data.getIncome());
        res.setIncomeFrequency(data.getIncomeFrequency());
        res.setGroupName(data.getGroupName());
        res.setGroupNumber(data.getGroupNumber());
        res.setLegalStatus(data.getLegalStatus());
        res.setCustomerStatus(data.getCustomerStatus());
        res.setDateLastModified(data.getDateLastModified());
        res.setApprovalStatus(data.getApprovalStatus());
        res.setComments(data.getComments());

        return res;
    }

    public CustomerDataResponse getCustomerDetails(Map<String, String> request) throws Exception {
        return findByByCustomerId(request.get("customerId"));
    }

    public void updateCustomerStatus(UpdateStatusRequest request) throws Exception {
        CustomerData data = null ;
        if (null != request.getCustomerId()){
            data = customerDataRepository.findByCustomerId(request.getCustomerId());
        } else if (0 != request.getId()){
            data = Optional.of(customerDataRepository.findById(request.getId())).get().orElse(null);
        }

        if (null != data){
            data.setApprovalStatus(request.getStatus());
            data.setComments(request.getComments());
            customerDataRepository.save(data);
        }else{
            throw new RuntimeException("Unable to update status. Please try again.");
        }

    }

    public void updateCustomerData(CustomerDataRequest request) throws Exception{

        CustomerData data = null ;
        if (null != request.getCustomerId()){
            data = customerDataRepository.findByCustomerId(request.getCustomerId());
        }

        if(null != data){
            customerDataRepository.save(createCustomer(request, data));
        }else{
            throw new RuntimeException("Failed to Update Customer details.");
        }
    }
}
