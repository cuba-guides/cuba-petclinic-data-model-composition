alter table PETCLINIC_ADDRESS add constraint FK_PETCLINIC_ADDRESS_OWNER foreign key (OWNER_ID) references PETCLINIC_OWNER(ID);
create index IDX_PETCLINIC_ADDRESS_OWNER on PETCLINIC_ADDRESS (OWNER_ID);
