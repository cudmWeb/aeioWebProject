package demo.cdcm.service;

import demo.cdcm.model.CustomerData;
import demo.cdcm.repository.CustomerDataRepository;
import demo.cdcm.request.CustomerDataRequest;
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
import java.util.Random;
import java.util.UUID;
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
        data.setCustomerId(getRandomUid(uniqueId));
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

    public List<CustomerDataResponse> getCustomers() {
        List<CustomerData> users = customerDataRepository.findAll();
        ModelMapper modelMapper = new ModelMapper();
        List<CustomerDataResponse> responseList = users.stream()
                .map(user -> modelMapper.map(user, CustomerDataResponse.class))
                .collect(Collectors.toList());
        return responseList;
    private String getRandomUid(String uniqueId) {

        Random random = new SecureRandom();
        int rand = random.nextInt();
        return (uniqueId + "-" + String.valueOf(rand));
    }

    public CustomerDataResponse searchCustomer(int id){
        CustomerData test =  customerDataRepository.findById(id).get();
        CustomerDataResponse res = new CustomerDataResponse();

        res.setCustomerId(test.getCustomerId());
        res.setSalutation(test.getSalutation());
        res.setCustomerName(test.getCustomerName());
        res.setSurname(test.getSurname());
        res.setForename1(test.getForename1());
        res.setForename2(test.getForename2());
        res.setCustomerAcronym(test.getCustomerAcronym());
        res.setVisionOUC(test.getVisionOUC());
        res.setVisionSBU(test.getVisionSBU());
        res.setAccountOfficer(test.getAccountOfficer());
        res.setCustomerOpenDate(test.getCustomerOpenDate());
        res.setCustomerGender(test.getCustomerGender());
        res.setDateOfBirth(test.getDateOfBirth());
        res.setPlaceOfBirth(test.getPlaceOfBirth());
        res.setMaritalStatus(test.getMaritalStatus());
        res.setSpouseName(test.getSpouseName());
        res.setSocialEconomicClass(test.getSocialEconomicClass());
        res.setNextOfKinName(test.getNextOfKinName());
        res.setNextOfKinIDType(test.getNextOfKinIdType());
        res.setNextOfKinIdNumber(test.getNextOfKinIdNumber());
        res.setNextOfKinTelephone(test.getNextOfKinTelephone());
        res.setNextOfKinEmailId(test.getNextOfKinEmailId());
        res.setNumberOfDependants(test.getNumberOfDependants());
        res.setAccountMandateName(test.getAccountMandateName());
        res.setAccountMandateIdType(test.getAccountMandateIdType());
        res.setAccountMandateIdNumber(test.getAccountMandateIdNumber());
        res.setNationality(test.getNationality());
        res.setResidence(test.getResidence());
        res.setCommAddress1(test.getCommAddress1());
        res.setCommAddress2(test.getCommAddress2());
        res.setCommVillage(test.getCommVillage());
        res.setCommCountry(test.getCommCountry());
        res.setCommResidenceType(test.getCommResidenceType());
        res.setPermAddress1(test.getPermAddress1());
        res.setPermAddress2(test.getPermAddress2());
        res.setPermVillage(test.getPermVillage());
        res.setPermCountry(test.getPermCountry());
        res.setEmailId(test.getEmailId());
        res.setWorkTelephone(test.getWorkTelephone());
        res.setHomeTelephone(test.getHomeTelephone());
        res.setFaxNumber1(test.getFaxNumber1());
        res.setFaxNumber2(test.getFaxNumber2());
        res.setEducation(test.getEducation());
        res.setCustomerTIN(test.getCustomerTIN());
        res.setNaicsCode(test.getNAICSCode());
        res.setEconomicSubSectorCodeISIC(test.getEconomicSubSectorCodeISIC());
        res.setRelatedParty(test.getRelatedParty());
        res.setRelationshipType(test.getRelationshipType());
        res.setRelatedPartyName(test.getRelatedPartyName());
        res.setLocalGovtMember(test.getLocalGovtMember());
        res.setInternetBankingSubscription(test.getInternetBankingSubscription());
        res.setMobileBankingSubscription(test.getMobileBankingSubscription());
        res.setSsnNumber(test.getSsnNumber());
        res.setNationalIDType(test.getNationalIDType());
        res.setNationalIDNumber(test.getNationalIDNumber());
        res.setHealthInsuranceNumber(test.getHealthInsuranceNumber());
        res.setOccupation(test.getOccupation());
        res.setEmployerName(test.getEmployerName());
        res.setEmployeeID(test.getEmployeeID());
        res.setEmpAddress1(test.getEmpAddress1());
        res.setEmpAddress2(test.getEmpAddress2());
        res.setEmpVillage(test.getEmpVillage());
        res.setEmpCountry(test.getEmpCountry());
        res.setIncome(test.getIncome());
        res.setIncomeFrequency(test.getIncomeFrequency());
        res.setGroupName(test.getGroupName());
        res.setGroupNumber(test.getGroupNumber());
        res.setLegalStatus(test.getLegalStatus());
        res.setCustomerStatus(test.getCustomerStatus());
        res.setDateLastModified(test.getDateLastModified());

     return res;

     }
}
