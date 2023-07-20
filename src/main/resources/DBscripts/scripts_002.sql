-- drop down table insert scripts
insert into DROP_DOWNS( drop_down_name,created_at,updated_at) values('salutation',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
insert into DROP_DOWNS( drop_down_name,created_at,updated_at) values('vision_SBU',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
insert into DROP_DOWNS( drop_down_name,created_at,updated_at) values('Marital_Status',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
insert into DROP_DOWNS( drop_down_name,created_at,updated_at) values('Gender',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
insert into DROP_DOWNS( drop_down_name,created_at,updated_at) values('Country',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
insert into DROP_DOWNS( drop_down_name,created_at,updated_at) values('Relationship_Type',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
insert into DROP_DOWNS( drop_down_name,created_at,updated_at) values('Occupation',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
insert into DROP_DOWNS( drop_down_name,created_at,updated_at) values('Related_Party',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
insert into DROP_DOWNS( drop_down_name,created_at,updated_at) values('Income_Frequency',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
insert into DROP_DOWNS( drop_down_name,created_at,updated_at) values('Legal_Status',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
insert into DROP_DOWNS( drop_down_name,created_at,updated_at) values('ID_Type',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
insert into DROP_DOWNS( drop_down_name,created_at,updated_at) values('General_Status',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
insert into DROP_DOWNS( drop_down_name,created_at,updated_at) values('Residents_Flag',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
insert into DROP_DOWNS( drop_down_name,created_at,updated_at) values('Education',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
insert into DROP_DOWNS( drop_down_name,created_at,updated_at) values('Village_List',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
insert into DROP_DOWNS( drop_down_name,created_at,updated_at) values('Place_of_Birth',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
insert into DROP_DOWNS( drop_down_name,created_at,updated_at) values('Social_Economic_Class',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
insert into DROP_DOWNS( drop_down_name,created_at,updated_at) values('Code',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
insert into DROP_DOWNS( drop_down_name,created_at,updated_at) values('Comm_Residence_Type',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

-- drop down values table insert scripts

--salutation
insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'salutation'), 'MISS', 'Miss',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'salutation'), 'MR', 'Mister',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'salutation'), 'MRS', 'Mrs',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'salutation'), 'MS', 'Miss/Mrs',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'salutation'), 'CORP', 'Company',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'salutation'), 'J', 'Joint/Group Acc',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

--vision_SBU
insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'vision_SBU'), 'MCEOTHR', 'Micro Enterprises',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'vision_SBU'), 'SMLOTHR', 'Small Enterprises',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'vision_SBU'), 'MEDOTHR', 'Medium Enterprises',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'vision_SBU'), 'LRGOTHR', 'Large Enterprises',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'vision_SBU'), 'RETL', 'Retail or Individuals',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'vision_SBU'), 'NGO', 'NGOs, charity/welfare organisations',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'vision_SBU'), 'SAGRP', 'Business Groups/Community',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'vision_SBU'), 'OTHER', 'Others',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

--Marital_Status
insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'Marital_Status'), '001', 'Married',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'Marital_Status'), '003', 'Widowed',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'Marital_Status'), '004', 'Separated',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'Marital_Status'), '005', 'Divorced',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'Marital_Status'), '006', 'Single',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'Marital_Status'), 'NA', 'Not Applicable (For Corporates)',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

--Gender
insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'Gender'), 'M', 'Male',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'Gender'), 'F', 'Female',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'Gender'), 'C', 'Corporate',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

-- Country
insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'Country'), 'AD', 'Andorra',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'Country'), 'AE', 'United Arab Emirates',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
     values((select id from DROP_DOWNS where drop_down_name = 'Country'), 'AF', 'Afghanistan',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'Country'), 'AG', 'Antigua and Barbuda',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'Country'), 'AI', 'Anguilla',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
     values((select id from DROP_DOWNS where drop_down_name = 'Country'), 'AL', 'Albania',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'Country'), 'AM', 'Armenia',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'Country'), 'AN', 'Netherlands Antilles',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
      values((select id from DROP_DOWNS where drop_down_name = 'Country'), 'AD', 'Andorra',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'Country'), 'AO', 'Angola',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

--Relationship_Type
insert into DROP_DOWN_VALUES(drop_down_id, drop_down_value, drop_down_description,created_at,updated_at)
    values((select id from DROP_DOWNS where drop_down_name = 'Relationship_Type'), '1', 'Spouse',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Relationship_Type'), '2', 'Husband', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Relationship_Type'), '3', 'Wife', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Relationship_Type'), '4', 'Father', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Relationship_Type'), '5', 'Mother', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Relationship_Type'), '6', 'Son', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Relationship_Type'), '7', 'Daughter', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Relationship_Type'), '8', 'Brother', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Relationship_Type'), '9', 'Sister', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Relationship_Type'), '10', 'Grandfather', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Relationship_Type'), '11', 'Grandmother', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Relationship_Type'), '12', 'Grandson', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Relationship_Type'), '13', 'Granddaughter', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Relationship_Type'), '14', 'Uncle', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Relationship_Type'), '15', 'Aunt', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Relationship_Type'), '16', 'Cousin', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Relationship_Type'), '17', 'Nephew', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Relationship_Type'), '18', 'Niece', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Relationship_Type'), '19', 'Father-in-law', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Relationship_Type'), '20', 'Mother-in-law', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Relationship_Type'), '21', 'Brother-in-law', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Relationship_Type'), '22', 'Sister-in-law', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Relationship_Type'), '23', 'Self', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Relationship_Type'), '24', 'Direct or indirect relationship with the bank', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Relationship_Type'), '25', 'Non Related Party', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

--Occupation
insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Occupation'), '0', 'Armed forces occupations', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Occupation'), '10', 'Commissioned armed forces officers', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Occupation'), '101', 'Commissioned armed forces officers', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Occupation'), '1010', 'Commissioned armed forces officers', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Occupation'), '20', 'Non-commissioned armed forces officers', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Occupation'), '201', 'Non-commissioned armed forces officers', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Occupation'), '2010', 'Non-commissioned armed forces officers', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Occupation'), '30', 'Armed forces occupations, other ranks', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Occupation'), '301', 'Armed forces occupations, other ranks', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Occupation'), '3010', 'Armed forces occupations, other ranks', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

--Related_Party
insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Related_Party'), 'DIR', 'Directors', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Related_Party'), 'MGT', 'Management/Senior Officer', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Related_Party'), 'NON', 'Non Related Party', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Related_Party'), 'PRN', 'Principal Owners/Shareholders/Promoters', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Related_Party'), 'STAFF', 'Staff', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Related_Party'), 'OTH1', 'Direct or indirect qualifying holding in your institution', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Related_Party'), 'OTH2', 'Direct or indirect control by your institution', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Related_Party'), 'OTH3', 'Spouse, partner, or family member up to the second degree of the related persons in your institution', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

--Income_Frequency
insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Income_Frequency'), 'M', 'Monthly', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Income_Frequency'), 'Q', 'Quarterly', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Income_Frequency'), 'A', 'Annual', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Income_Frequency'), 'D', 'Daily', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Income_Frequency'), 'W', 'Weekly', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Income_Frequency'), 'NA', 'Not Applicable', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

--Legal_Status
insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Legal_Status'), '1', 'Sole Trader', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Legal_Status'), '2', 'Partnership', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Legal_Status'), '3', 'Private Company', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Legal_Status'), '4', 'Public Company', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Legal_Status'), '5', 'Trustee', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Legal_Status'), '6', 'Co operatives', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Legal_Status'), '7', 'Non-Profit Organization', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

--ID_Type
insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'ID_Type'), '1', 'Driving_License', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'ID_Type'), '2', 'National_ID', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'ID_Type'), '3', 'Refugee ID', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'ID_Type'), '4', 'Passport', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'ID_Type'), '5', 'Foreigner\'s ID', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'ID_Type'), '6', 'Registration Number (For companies only)', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

--General_Status
insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'General_Status'), '0', 'Active', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'General_Status'), '1', 'Inactive', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'General_Status'), '9', 'Delete', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

--Residents_Flag
insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Residents_Flag'), 'R', 'Resident', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Residents_Flag'), 'NR', 'Non - Resident', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

--Education
insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Education'), '1', 'PHD', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Education'), '2', 'Masters', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Education'), '3', 'Bachelors Degree', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Education'), '4', 'Diploma (A2 or A1 level)', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Education'), '5', 'School attendace below A2 level', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Education'), '6', 'High School', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Education'), '7', 'Primary School', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Education'), '8', 'Below Primary', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

--Place_of_Birth
insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Place_of_Birth'), 'Local Born', 'Village_List', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Place_of_Birth'), 'Else', 'Countries', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

--Social_Economic_Class
insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Social_Economic_Class'), '1', 'Families who do not own a house and can hardly afford basic needs', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Social_Economic_Class'), '2', 'Those who have a dwelling of their own or are able to rent one but rarely get full time jobs', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Social_Economic_Class'), '3', 'Those who have a job and farmers who go beyond subsistence farming to produce a surplus which can be sold. The latter also includes those with small and medium enterprises who can provide employment to dozens of people', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Social_Economic_Class'), '4', 'Those who own large-scale business, individuals working with international organisations and industries as well as public servants', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Social_Economic_Class'), '9999', 'Not Applicable', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

--Code
insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '1', '0 -30,000', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
    values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '2', '30,001 - 100,000', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '3', '101,000 - 170,000', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '4', '171,000 - 230,000', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '5', '231,000 - 300,000', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '6', '301,000 - 370,000', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '7', '371,000 - 440,000', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '8', '441,000 - 510,000', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '9', '511,000 - 580,000', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '10', '581,000 - 650,000', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '11', '651,000 - 720,000', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '12', '721,000 - 790,000', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '13', '791,000 - 860,000', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '14', '861,000 - 930,000', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '15', '931,000 - 1,000,000', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '16', '1,001,000 - 1,070,000', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '17', '1,071,000 - 1,140,000', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '18', '1,141,000 - 1,210,000', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '19', '1,211,000 - 1,280,000', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '20', '1,281,000 - 1,350,000', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '21', '1,351,000 - 1,420,000', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '22', '1,421,000 - 1,490,000', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '23', '1,491,000 - 1,560,000', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '24', '1,561,000 - 1,630,000', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '25', '1,631,000 - 1,700,000', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '26', '1,701,000 - 1,770,000', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '27', '1,771,000 - 1,840,000', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '28', '1,841,000 - 1,910,000', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '29', '1,911,000 - 1,980,000', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Code'), '30', '1,981,000 and above', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

--Comm_Residence_Type
insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Comm_Residence_Type'), 'O', 'Owner', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

insert into DROP_DOWN_VALUES (drop_down_id, drop_down_value, drop_down_description, created_at, updated_at)
values ((select id from DROP_DOWNS where drop_down_name = 'Comm_Residence_Type'), 'T', 'Tenant', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);