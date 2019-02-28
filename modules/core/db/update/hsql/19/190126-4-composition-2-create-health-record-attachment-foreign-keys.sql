alter table PETCLINIC_HEALTH_RECORD_ATTACHMENT add constraint FK_PETCLINIC_HEALTH_RECORD_ATTACHMENT_FILE foreign key (FILE_ID) references SYS_FILE(ID);
alter table PETCLINIC_HEALTH_RECORD_ATTACHMENT add constraint FK_PETCLINIC_HEALTH_RECORD_ATTACHMENT_HEALTH_RECORD foreign key (HEALTH_RECORD_ID) references PETCLINIC_HEALTH_RECORD(ID);
create index IDX_PETCLINIC_HEALTH_RECORD_ATTACHMENT_FILE on PETCLINIC_HEALTH_RECORD_ATTACHMENT (FILE_ID);
create index IDX_PETCLINIC_HEALTH_RECORD_ATTACHMENT_HEALTH_RECORD on PETCLINIC_HEALTH_RECORD_ATTACHMENT (HEALTH_RECORD_ID);