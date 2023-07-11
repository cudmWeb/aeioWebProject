package demo.cdcm.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class CustomerCreateDTO implements Serializable {

    private String salutation;
    private String customerName;
    private String surname;
    private String forename1;
    private String forename2;
    private String customerAcronym;
    private String visionOUC;
    private String visionSBU;
    private String accountOfficer;
    private java.util.Date customerOpenDate;
    private String customerGender;
    private Date dateOfBirth;
    private String placeOfBirth;
    private String maritalStatus;
    private String spouseName;
    private Long socialEconomicClass;
    private String nextOfKinName;
    private Long nextOfKinIDType;
    private String nextOfKinIdNumber;
    private String nextOfKinTelephone;
    private String nextOfKinEmailId;
    private String numberOfDependants;
    private String accountMandateName;
    private Long accountMandateIdType;
    private String accountMandateIdNumber;
    private String nationality;
    private String residence;
    private String commAddress1;
    private String commAddress2;
    private String commVillage;
    private String commCountry;
    private String commResidenceType;
    private String permAddress1;
    private String permAddress2;
    private String permVillage;
    private String permCountry;
    private String emailId;
    private String workTelephone;
    private String homeTelephone;
    private String faxNumber1;
    private String faxNumber2;
    private Long education;
    private String customerTIN;
    private Long NAICSCode;
    private String economicSubSectorCodeISIC;
    private String relatedParty;
    private Long relationshipType;
    private String relatedPartyName;
    private String localGovtMember;
    private String internetBankingSubscription;
    private String mobileBankingSubscription;
    private String ssnNumber;
    private Long nationalIDType;
    private String nationalIDNumber;
    private String healthInsuranceNumber;
    private Long occupation;
    private String employerName;
    private String employeeID;
    private String empAddress1;
    private String empAddress2;
    private String empVillage;
    private String empCountry;
    private Long income;
    private String incomeFrequency;
    private String groupName;
    private String groupNumber;
    private Long legalStatus;
    private Long customerStatus;
    private Date dateLastModified;

}