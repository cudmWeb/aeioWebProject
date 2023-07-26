package demo.cdcm.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "CUSTOMERS")
public class CustomerData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "CUSTOMER_ID")
    private String customerId;
    @Column(name = "SALUTATION")
    private String salutation;
    @Column(name = "CUSTOMER_NAME")
    private String customerName;
    @Column(name = "SURNAME")
    private String surname;
    @Column(name = "FORENAME_1")
    private String forename1;
    @Column(name = "FORENAME_2")
    private String forename2;
    @Column(name = "CUSTOMER_ACRONYM")
    private String customerAcronym;
    @Column(name = "VISION_OUC")
    private String visionOUC;
    @Column(name = "VISION_SBU")
    private String visionSBU;
    @Column(name = "ACCOUNT_OFFICER")
    private String accountOfficer;
    @Column(name = "CUSTOMER_OPEN_DATE")
    private java.util.Date customerOpenDate;
    @Column(name = "CUSTOMER_GENDER")
    private String customerGender;
    @Column(name = "DATE_OF_BIRTH")
    private Date dateOfBirth;
    @Column(name = "PLACE_OF_BIRTH")
    private String placeOfBirth;
    @Column(name = "MARITAL_STATUS")
    private String maritalStatus;
    @Column(name = "SPOUSE_NAME")
    private String spouseName;
    @Column(name = "SOCIAL_ECONOMIC_CLASS")
    private Long socialEconomicClass;
    @Column(name = "NEXT_OF_KIN_NAME")
    private String nextOfKinName;
    @Column(name = "NEXT_OF_KIN_ID_TYPE")
    private Long nextOfKinIdType;
    @Column(name = "NEXT_OF_KIN_ID_NUMBER")
    private String nextOfKinIdNumber;
    @Column(name = "NEXT_OF_KIN_TELEPHONE")
    private String nextOfKinTelephone;
    @Column(name = "NEXT_OF_KIN_EMAIL_ID")
    private String nextOfKinEmailId;
    @Column(name = "NUMBER_OF_DEPENDANTS")
    private String numberOfDependants;
    @Column(name = "ACCOUNT_MANDATE_NAME")
    private String accountMandateName;
    @Column(name = "ACCOUNT_MANDATE_ID_TYPE")
    private Long accountMandateIdType;
    @Column(name = "ACCOUNT_MANDATE_ID_NUMBER")
    private String accountMandateIdNumber;
    @Column(name = "NATIONALITY")
    private String nationality;
    @Column(name = "RESIDENCE")
    private String residence;
    @Column(name = "COMM_ADDRESS_1")
    private String commAddress1;
    @Column(name = "COMM_ADDRESS_2")
    private String commAddress2;
    @Column(name = "COMM_VILLAGE")
    private String commVillage;
    @Column(name = "COMM_COUNTRY")
    private String commCountry;
    @Column(name = "COMM_RESIDENCE_TYPE")
    private String commResidenceType;
    @Column(name = "PERM_ADDRESS_1")
    private String permAddress1;
    @Column(name = "PERM_ADDRESS_2")
    private String permAddress2;
    @Column(name = "PERM_VILLAGE")
    private String permVillage;
    @Column(name = "PERM_COUNTRY")
    private String permCountry;
    @Column(name = "EMAIL_ID")
    private String emailId;
    @Column(name = "WORK_TELEPHONE")
    private String workTelephone;
    @Column(name = "HOME_TELEPHONE")
    private String homeTelephone;
    @Column(name = "FAX_NUMBER_1")
    private String faxNumber1;
    @Column(name = "FAX_NUMBER_2")
    private String faxNumber2;
    @Column(name = "EDUCATION")
    private Long education;
    @Column(name = "CUSTOMER_TIN")
    private String customerTIN;
    @Column(name = "NAICS_CODE")
    private Long NAICSCode;
    @Column(name = "ECONOMIC_SUB_SECTOR_CODE_ISIC")
    private String economicSubSectorCodeISIC;
    @Column(name = "RELATED_PARTY")
    private String relatedParty;
    @Column(name = "RELATIONSHIP_TYPE")
    private Long relationshipType;
    @Column(name = "RELATED_PARTY_NAME")
    private String relatedPartyName;
    @Column(name = "LOCAL_GOVT_MEMBER")
    private String localGovtMember;
    @Column(name = "INTERNET_BANKING_SUBSCRIPTION")
    private String internetBankingSubscription;
    @Column(name = "MOBILE_BANKING_SUBSCRIPTION")
    private String mobileBankingSubscription;
    @Column(name = "SSN_NUMBER")
    private String ssnNumber;
    @Column(name = "NATIONAL_ID_TYPE")
    private Long nationalIDType;
    @Column(name = "NATIONAL_ID_NUMBER")
    private String nationalIDNumber;
    @Column(name = "HEALTH_INSURANCE_NUMBER")
    private String healthInsuranceNumber;
    @Column(name = "OCCUPATION")
    private Long occupation;
    @Column(name = "EMPLOYER_NAME")
    private String employerName;
    @Column(name = "EMPLOYEE_ID")
    private String employeeID;
    @Column(name = "EMP_ADDRESS_1")
    private String empAddress1;
    @Column(name = "EMP_ADDRESS_2")
    private String empAddress2;
    @Column(name = "EMP_VILLAGE")
    private String empVillage;
    @Column(name = "EMP_COUNTRY")
    private String empCountry;
    @Column(name = "INCOME")
    private Long income;
    @Column(name = "INCOME_FREQUENCY")
    private String incomeFrequency;
    @Column(name = "GROUP_NAME")
    private String groupName;
    @Column(name = "GROUP_NUMBER")
    private String groupNumber;
    @Column(name = "LEGAL_STATUS")
    private Long legalStatus;
    @Column(name = "CUSTOMER_STATUS")
    private Long customerStatus;
    @Column(name = "DATE_LAST_MODIFIED")
    private Date dateLastModified;

    @CreationTimestamp
    @Column(name = "CREATED_AT")
    private Timestamp createdAt;

    @UpdateTimestamp
    @Column(name = "UPDATED_AT")
    private Timestamp updatedAt;

    @Column(name = "COMMENTS")
    private String comments;

    @Column(name = "APPROVAL_STATUS")
    private String approvalStatus;

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getForename1() {
        return forename1;
    }

    public void setForename1(String forename1) {
        this.forename1 = forename1;
    }

    public String getForename2() {
        return forename2;
    }

    public void setForename2(String forename2) {
        this.forename2 = forename2;
    }

    public String getCustomerAcronym() {
        return customerAcronym;
    }

    public void setCustomerAcronym(String customerAcronym) {
        this.customerAcronym = customerAcronym;
    }

    public String getVisionOUC() {
        return visionOUC;
    }

    public void setVisionOUC(String visionOUC) {
        this.visionOUC = visionOUC;
    }

    public String getVisionSBU() {
        return visionSBU;
    }

    public void setVisionSBU(String visionSBU) {
        this.visionSBU = visionSBU;
    }

    public String getAccountOfficer() {
        return accountOfficer;
    }

    public void setAccountOfficer(String accountOfficer) {
        this.accountOfficer = accountOfficer;
    }

    public Date getCustomerOpenDate() {
        return customerOpenDate;
    }

    public void setCustomerOpenDate(Date customerOpenDate) {
        this.customerOpenDate = customerOpenDate;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public Long getSocialEconomicClass() {
        return socialEconomicClass;
    }

    public void setSocialEconomicClass(Long socialEconomicClass) {
        this.socialEconomicClass = socialEconomicClass;
    }

    public String getNextOfKinName() {
        return nextOfKinName;
    }

    public void setNextOfKinName(String nextOfKinName) {
        this.nextOfKinName = nextOfKinName;
    }

    public Long getNextOfKinIdType() {
        return nextOfKinIdType;
    }

    public void setNextOfKinIdType(Long nextOfKinIdType) {
        this.nextOfKinIdType = nextOfKinIdType;
    }

    public String getNextOfKinIdNumber() {
        return nextOfKinIdNumber;
    }

    public void setNextOfKinIdNumber(String nextOfKinIdNumber) {
        this.nextOfKinIdNumber = nextOfKinIdNumber;
    }

    public String getNextOfKinTelephone() {
        return nextOfKinTelephone;
    }

    public void setNextOfKinTelephone(String nextOfKinTelephone) {
        this.nextOfKinTelephone = nextOfKinTelephone;
    }

    public String getNextOfKinEmailId() {
        return nextOfKinEmailId;
    }

    public void setNextOfKinEmailId(String nextOfKinEmailId) {
        this.nextOfKinEmailId = nextOfKinEmailId;
    }

    public String getNumberOfDependants() {
        return numberOfDependants;
    }

    public void setNumberOfDependants(String numberOfDependants) {
        this.numberOfDependants = numberOfDependants;
    }

    public String getAccountMandateName() {
        return accountMandateName;
    }

    public void setAccountMandateName(String accountMandateName) {
        this.accountMandateName = accountMandateName;
    }

    public Long getAccountMandateIdType() {
        return accountMandateIdType;
    }

    public void setAccountMandateIdType(Long accountMandateIdType) {
        this.accountMandateIdType = accountMandateIdType;
    }

    public String getAccountMandateIdNumber() {
        return accountMandateIdNumber;
    }

    public void setAccountMandateIdNumber(String accountMandateIdNumber) {
        this.accountMandateIdNumber = accountMandateIdNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getCommAddress1() {
        return commAddress1;
    }

    public void setCommAddress1(String commAddress1) {
        this.commAddress1 = commAddress1;
    }

    public String getCommAddress2() {
        return commAddress2;
    }

    public void setCommAddress2(String commAddress2) {
        this.commAddress2 = commAddress2;
    }

    public String getCommVillage() {
        return commVillage;
    }

    public void setCommVillage(String commVillage) {
        this.commVillage = commVillage;
    }

    public String getCommCountry() {
        return commCountry;
    }

    public void setCommCountry(String commCountry) {
        this.commCountry = commCountry;
    }

    public String getCommResidenceType() {
        return commResidenceType;
    }

    public void setCommResidenceType(String commResidenceType) {
        this.commResidenceType = commResidenceType;
    }

    public String getPermAddress1() {
        return permAddress1;
    }

    public void setPermAddress1(String permAddress1) {
        this.permAddress1 = permAddress1;
    }

    public String getPermAddress2() {
        return permAddress2;
    }

    public void setPermAddress2(String permAddress2) {
        this.permAddress2 = permAddress2;
    }

    public String getPermVillage() {
        return permVillage;
    }

    public void setPermVillage(String permVillage) {
        this.permVillage = permVillage;
    }

    public String getPermCountry() {
        return permCountry;
    }

    public void setPermCountry(String permCountry) {
        this.permCountry = permCountry;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getWorkTelephone() {
        return workTelephone;
    }

    public void setWorkTelephone(String workTelephone) {
        this.workTelephone = workTelephone;
    }

    public String getHomeTelephone() {
        return homeTelephone;
    }

    public void setHomeTelephone(String homeTelephone) {
        this.homeTelephone = homeTelephone;
    }

    public String getFaxNumber1() {
        return faxNumber1;
    }

    public void setFaxNumber1(String faxNumber1) {
        this.faxNumber1 = faxNumber1;
    }

    public String getFaxNumber2() {
        return faxNumber2;
    }

    public void setFaxNumber2(String faxNumber2) {
        this.faxNumber2 = faxNumber2;
    }

    public Long getEducation() {
        return education;
    }

    public void setEducation(Long education) {
        this.education = education;
    }

    public String getCustomerTIN() {
        return customerTIN;
    }

    public void setCustomerTIN(String customerTIN) {
        this.customerTIN = customerTIN;
    }

    public Long getNAICSCode() {
        return NAICSCode;
    }

    public void setNAICSCode(Long NAICSCode) {
        this.NAICSCode = NAICSCode;
    }

    public String getEconomicSubSectorCodeISIC() {
        return economicSubSectorCodeISIC;
    }

    public void setEconomicSubSectorCodeISIC(String economicSubSectorCodeISIC) {
        this.economicSubSectorCodeISIC = economicSubSectorCodeISIC;
    }

    public String getRelatedParty() {
        return relatedParty;
    }

    public void setRelatedParty(String relatedParty) {
        this.relatedParty = relatedParty;
    }

    public Long getRelationshipType() {
        return relationshipType;
    }

    public void setRelationshipType(Long relationshipType) {
        this.relationshipType = relationshipType;
    }

    public String getRelatedPartyName() {
        return relatedPartyName;
    }

    public void setRelatedPartyName(String relatedPartyName) {
        this.relatedPartyName = relatedPartyName;
    }

    public String getLocalGovtMember() {
        return localGovtMember;
    }

    public void setLocalGovtMember(String localGovtMember) {
        this.localGovtMember = localGovtMember;
    }

    public String getInternetBankingSubscription() {
        return internetBankingSubscription;
    }

    public void setInternetBankingSubscription(String internetBankingSubscription) {
        this.internetBankingSubscription = internetBankingSubscription;
    }

    public String getMobileBankingSubscription() {
        return mobileBankingSubscription;
    }

    public void setMobileBankingSubscription(String mobileBankingSubscription) {
        this.mobileBankingSubscription = mobileBankingSubscription;
    }

    public String getSsnNumber() {
        return ssnNumber;
    }

    public void setSsnNumber(String ssnNumber) {
        this.ssnNumber = ssnNumber;
    }

    public Long getNationalIDType() {
        return nationalIDType;
    }

    public void setNationalIDType(Long nationalIDType) {
        this.nationalIDType = nationalIDType;
    }

    public String getNationalIDNumber() {
        return nationalIDNumber;
    }

    public void setNationalIDNumber(String nationalIDNumber) {
        this.nationalIDNumber = nationalIDNumber;
    }

    public String getHealthInsuranceNumber() {
        return healthInsuranceNumber;
    }

    public void setHealthInsuranceNumber(String healthInsuranceNumber) {
        this.healthInsuranceNumber = healthInsuranceNumber;
    }

    public Long getOccupation() {
        return occupation;
    }

    public void setOccupation(Long occupation) {
        this.occupation = occupation;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmpAddress1() {
        return empAddress1;
    }

    public void setEmpAddress1(String empAddress1) {
        this.empAddress1 = empAddress1;
    }

    public String getEmpAddress2() {
        return empAddress2;
    }

    public void setEmpAddress2(String empAddress2) {
        this.empAddress2 = empAddress2;
    }

    public String getEmpVillage() {
        return empVillage;
    }

    public void setEmpVillage(String empVillage) {
        this.empVillage = empVillage;
    }

    public String getEmpCountry() {
        return empCountry;
    }

    public void setEmpCountry(String empCountry) {
        this.empCountry = empCountry;
    }

    public Long getIncome() {
        return income;
    }

    public void setIncome(Long income) {
        this.income = income;
    }

    public String getIncomeFrequency() {
        return incomeFrequency;
    }

    public void setIncomeFrequency(String incomeFrequency) {
        this.incomeFrequency = incomeFrequency;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Long getLegalStatus() {
        return legalStatus;
    }

    public void setLegalStatus(Long legalStatus) {
        this.legalStatus = legalStatus;
    }

    public Long getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(Long customerStatus) {
        this.customerStatus = customerStatus;
    }

    public Date getDateLastModified() {
        return dateLastModified;
    }

    public void setDateLastModified(Date dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
