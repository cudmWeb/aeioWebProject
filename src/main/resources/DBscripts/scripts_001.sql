--drop downs
insert into drop_downs( drop_down_name,created_at,updated_at) values('salutation',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
insert into drop_downs( drop_down_name) values('vision_SBU');

----salutation
insert into drop_down_values(drop_down_id, drop_down_value, drop_down_description)
    values((select id from drop_downs where drop_down_name = 'salutation'), 'MISS', 'Miss');

insert into drop_down_values(drop_down_id, drop_down_value, drop_down_description)
    values((select id from drop_downs where drop_down_name = 'salutation'), 'MR', 'Mister');

insert into drop_down_values(drop_down_id, drop_down_value, drop_down_description)
    values((select id from drop_downs where drop_down_name = 'salutation'), 'MRS', 'Mrs');

---vision_SBU
insert into drop_down_values(drop_down_id, drop_down_value, drop_down_description)
    values((select id from drop_downs where drop_down_name = 'vision_SBU'), 'MCEOTHR', 'Micro Enterprises');

insert into drop_down_values(drop_down_id, drop_down_value, drop_down_description)
    values((select id from drop_downs where drop_down_name = 'vision_SBU'), 'SMLOTHR', 'Small Enterprises');