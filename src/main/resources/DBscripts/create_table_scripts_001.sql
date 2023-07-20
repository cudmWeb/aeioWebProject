--Create test db
create table test(id int not null, name varchar(20), code bigint);
-- drop table test;

-- create customer table
create table CUSTOMERS (ID int NOT NULL AUTO_INCREMENT,
CUSTOMER_ID varchar(14),
SALUTATION varchar(10),
CUSTOMER_NAME varchar(80),
SURNAME varchar(80),
FORENAME_1 varchar(80),
FORENAME_2 varchar(80),
CUSTOMER_ACRONYM varchar(20),
VISION_OUC varchar(10),
VISION_SBU varchar(10),
ACCOUNT_OFFICER varchar(15),
CUSTOMER_OPEN_DATE Date,
CUSTOMER_GENDER varchar(10),
DATE_OF_BIRTH Date,
PLACE_OF_BIRTH varchar(80),
MARITAL_STATUS varchar(10),
SPOUSE_NAME varchar(80),
SOCIAL_ECONOMIC_CLASS int(4),
NEXT_OF_KIN_NAME varchar(80),
NEXT_OF_KIN_ID_TYPE int(4),
NEXT_OF_KIN_ID_NUMBER varchar(20),
NEXT_OF_KIN_TELEPHONE varchar(20),
NEXT_OF_KIN_EMAIL_ID varchar(40),
NUMBER_OF_DEPENDANTS varchar(3),
ACCOUNT_MANDATE_NAME varchar(255),
ACCOUNT_MANDATE_ID_TYPE int(4),
ACCOUNT_MANDATE_ID_NUMBER varchar(20),
NATIONALITY varchar(2),
RESIDENCE varchar(2),
COMM_ADDRESS_1 varchar(100),
COMM_ADDRESS_2 varchar(100),
COMM_VILLAGE varchar(10),
COMM_COUNTRY varchar(2),
COMM_RESIDENCE_TYPE varchar(1),
PERM_ADDRESS_1 varchar(100),
PERM_ADDRESS_2 varchar(100),
PERM_VILLAGE varchar(10),
PERM_COUNTRY varchar(2),
EMAIL_ID varchar(100),
WORK_TELEPHONE varchar(20),
HOME_TELEPHONE varchar(20),
FAX_NUMBER_1 varchar(20),
FAX_NUMBER_2 varchar(20),
EDUCATION int(4),
CUSTOMER_TIN varchar(10),
NAICS_CODE int(6),
ECONOMIC_SUB_SECTOR_CODE_ISIC varchar(10),
RELATED_PARTY varchar(10),
RELATIONSHIP_TYPE int(4),
RELATED_PARTY_NAME varchar(80),
LOCAL_GOVT_MEMBER varchar(1),
INTERNET_BANKING_SUBSCRIPTION varchar(1),
MOBILE_BANKING_SUBSCRIPTION varchar(1),
SSN_NUMBER varchar(10),
NATIONAL_ID_TYPE int(4),
NATIONAL_ID_NUMBER varchar(16),
HEALTH_INSURANCE_NUMBER varchar(15),
OCCUPATION int(4),
EMPLOYER_NAME varchar(80),
EMPLOYEE_ID varchar(15),
EMP_ADDRESS_1 varchar(100),
EMP_ADDRESS_2 varchar(100),
EMP_VILLAGE varchar(10),
EMP_COUNTRY varchar(2),
INCOME int(4),
INCOME_FREQUENCY varchar(10),
GROUP_NAME varchar(80),
GROUP_NUMBER varchar(20),
LEGAL_STATUS int(4),
CUSTOMER_STATUS int(4),
DATE_LAST_MODIFIED Datetime,
PRIMARY KEY (ID));
--  drop table customers ;

--create drop down table
create table DROP_DOWNS(ID int NOT NULL AUTO_INCREMENT, DROP_DOWN_NAME varchar(55),CREATED_AT datetime,UPDATED_AT datetime, PRIMARY KEY (ID));
-- drop table DROP_DOWNS ;

--create drop down value table
create table DROP_DOWN_VALUES(ID int NOT NULL AUTO_INCREMENT,DROP_DOWN_ID int not null, DROP_DOWN_VALUE varchar(55),
 DROP_DOWN_DESCRIPTION varchar(255),CREATED_AT datetime,UPDATED_AT datetime, PRIMARY KEY (ID));
-- drop table DROP_DOWN_VALUES ;

