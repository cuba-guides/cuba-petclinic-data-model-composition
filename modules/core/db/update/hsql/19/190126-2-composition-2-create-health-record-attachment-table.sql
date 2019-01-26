create table PETCLINIC_HEALTH_RECORD_ATTACHMENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    NAME varchar(255),
    --
    TYPE_ varchar(50) not null,
    ATTACHMENT_DATE date,
    RECEIVE_DATE date,
    HANDED_OUT boolean,
    HANDED_OUT_DATE date,
    FILE_ID varchar(36) not null,
    HEALTH_RECORD_ID varchar(36) not null,
    --
    primary key (ID)
);