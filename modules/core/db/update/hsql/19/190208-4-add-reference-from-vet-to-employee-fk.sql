alter table PETCLINIC_VET add constraint FK_PETCLINIC_VET_EMPLOYEE foreign key (EMPLOYEE_ID) references PETCLINIC_EMPLOYEE(ID);
create index IDX_PETCLINIC_VET_EMPLOYEE on PETCLINIC_VET (EMPLOYEE_ID);
