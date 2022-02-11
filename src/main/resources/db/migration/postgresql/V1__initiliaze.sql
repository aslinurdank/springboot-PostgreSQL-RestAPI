drop sequence if exists seq_case_data;
create sequence seq_case_data start 1 increment 1;
create table case_data (id int8 not null, date_field varchar(255), date_time_field varchar(255), email_field varchar(255), moneygbpfield varchar(255), number_field varchar(255), phoneukfield varchar(255), text_field varchar(255), primary key (id));

INSERT INTO case_data (id,date_field,date_time_field,email_field,moneygbpfield,	number_field,phoneukfield,text_field) VALUES (NEXTVAL('seq_case_data') , '10/02/2022','12:21','aslinurdan@gmail.com','1500','2022/02','078312345675','address LE2');
INSERT INTO case_data (id,date_field,date_time_field,email_field,moneygbpfield,	number_field,phoneukfield,text_field) VALUES (NEXTVAL('seq_case_data') , '31/03/2021','14:42','suat@gmail.com','2000','2021/03','07812354625','address MK8');
INSERT INTO case_data (id,date_field,date_time_field,email_field,moneygbpfield,	number_field,phoneukfield,text_field) VALUES (NEXTVAL('seq_case_data') , '17/02/2021','13:51','nurten@gmail.com','1500','2021/02','07658745828','address LE1');