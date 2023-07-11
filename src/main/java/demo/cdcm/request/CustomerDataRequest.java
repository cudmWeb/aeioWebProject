package demo.cdcm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class CustomerDataRequest {

    private String customerId;
    private String salutation;
    private String customerName;
    private String surname;
    private String forename1;
    private String forename2;
    private String customerAcronym;
    private String visionOUC;
    private String visionSBU;
    private String accountOfficer;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/YYYY")
    private java.util.Date customerOpenDate;
    private String customerGender;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/YYYY")
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
    private Long naicsCode;
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/YYYY")
    private Date dateLastModified;

    @Override
    public String toString() {
        return "CustomerDataRequest{" +
                "customerId='" + customerId + '\'' +
                ", salutation='" + salutation + '\'' +
                ", customerName='" + customerName + '\'' +
                ", surname='" + surname + '\'' +
                ", forename1='" + forename1 + '\'' +
                ", forename2='" + forename2 + '\'' +
                ", customerAcronym='" + customerAcronym + '\'' +
                ", visionOUC='" + visionOUC + '\'' +
                ", visionSBU='" + visionSBU + '\'' +
                ", accountOfficer='" + accountOfficer + '\'' +
                ", customerOpenDate=" + customerOpenDate +
                ", customerGender='" + customerGender + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", spouseName='" + spouseName + '\'' +
                ", socialEconomicClass=" + socialEconomicClass +
                ", nextOfKinName='" + nextOfKinName + '\'' +
                ", nextOfKinIDType=" + nextOfKinIDType +
                ", nextOfKinIdNumber='" + nextOfKinIdNumber + '\'' +
                ", nextOfKinTelephone='" + nextOfKinTelephone + '\'' +
                ", nextOfKinEmailId='" + nextOfKinEmailId + '\'' +
                ", numberOfDependants='" + numberOfDependants + '\'' +
                ", accountMandateName='" + accountMandateName + '\'' +
                ", accountMandateIdType=" + accountMandateIdType +
                ", accountMandateIdNumber='" + accountMandateIdNumber + '\'' +
                ", nationality='" + nationality + '\'' +
                ", residence='" + residence + '\'' +
                ", commAddress1='" + commAddress1 + '\'' +
                ", commAddress2='" + commAddress2 + '\'' +
                ", commVillage='" + commVillage + '\'' +
                ", commCountry='" + commCountry + '\'' +
                ", commResidenceType='" + commResidenceType + '\'' +
                ", permAddress1='" + permAddress1 + '\'' +
                ", permAddress2='" + permAddress2 + '\'' +
                ", permVillage='" + permVillage + '\'' +
                ", permCountry='" + permCountry + '\'' +
                ", emailId='" + emailId + '\'' +
                ", workTelephone='" + workTelephone + '\'' +
                ", homeTelephone='" + homeTelephone + '\'' +
                ", faxNumber1='" + faxNumber1 + '\'' +
                ", faxNumber2='" + faxNumber2 + '\'' +
                ", education=" + education +
                ", customerTIN='" + customerTIN + '\'' +
                ", NAICSCode=" + naicsCode +
                ", economicSubSectorCodeISIC='" + economicSubSectorCodeISIC + '\'' +
                ", relatedParty='" + relatedParty + '\'' +
                ", relationshipType=" + relationshipType +
                ", relatedPartyName='" + relatedPartyName + '\'' +
                ", localGovtMember='" + localGovtMember + '\'' +
                ", internetBankingSubscription='" + internetBankingSubscription + '\'' +
                ", mobileBankingSubscription='" + mobileBankingSubscription + '\'' +
                ", ssnNumber='" + ssnNumber + '\'' +
                ", nationalIDType=" + nationalIDType +
                ", nationalIDNumber='" + nationalIDNumber + '\'' +
                ", healthInsuranceNumber='" + healthInsuranceNumber + '\'' +
                ", occupation=" + occupation +
                ", employerName='" + employerName + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", empAddress1='" + empAddress1 + '\'' +
                ", empAddress2='" + empAddress2 + '\'' +
                ", empVillage='" + empVillage + '\'' +
                ", empCountry='" + empCountry + '\'' +
                ", income=" + income +
                ", incomeFrequency='" + incomeFrequency + '\'' +
                ", groupName='" + groupName + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                ", legalStatus=" + legalStatus +
                ", customerStatus=" + customerStatus +
                ", dateLastModified=" + dateLastModified +
                '}';
    }
}
