alter table PETCLINIC_EMPLOYEE_RECORD add column AMOUNT_SICK_DAYS integer ;
alter table PETCLINIC_EMPLOYEE_RECORD add column PERSONELL_NUMBER integer ^
update PETCLINIC_EMPLOYEE_RECORD set PERSONELL_NUMBER = 0 where PERSONELL_NUMBER is null ;
alter table PETCLINIC_EMPLOYEE_RECORD alter column PERSONELL_NUMBER set not null ;