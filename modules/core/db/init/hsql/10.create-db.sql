-- begin PETCLINIC_PET
create table PETCLINIC_PET (
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
    IDENTIFICATION_NUMBER varchar(255) not null,
    BIRTH_DATE date,
    TYPE_ID varchar(36),
    OWNER_ID varchar(36),
    --
    primary key (ID)
)^
-- end PETCLINIC_PET
-- begin PETCLINIC_PET_TYPE
create table PETCLINIC_PET_TYPE (
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
    primary key (ID)
)^
-- end PETCLINIC_PET_TYPE
-- begin PETCLINIC_OWNER
create table PETCLINIC_OWNER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255),
    --
    EMAIL varchar(255),
    TELEPHONE varchar(255),
    --
    primary key (ID)
)^
-- end PETCLINIC_OWNER
-- begin PETCLINIC_VET
create table PETCLINIC_VET (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255),
    --
    EMPLOYEE_ID varchar(36),
    --
    primary key (ID)
)^
-- end PETCLINIC_VET
-- begin PETCLINIC_SPECIALTY
create table PETCLINIC_SPECIALTY (
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
    primary key (ID)
)^
-- end PETCLINIC_SPECIALTY
-- begin PETCLINIC_VISIT
create table PETCLINIC_VISIT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    VISIT_DATE date not null,
    DESCRIPTION varchar(4000),
    PET_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end PETCLINIC_VISIT
-- begin PETCLINIC_VET_SPECIALTY_LINK
create table PETCLINIC_VET_SPECIALTY_LINK (
    VET_ID varchar(36) not null,
    SPECIALTY_ID varchar(36) not null,
    primary key (VET_ID, SPECIALTY_ID)
)^
-- end PETCLINIC_VET_SPECIALTY_LINK
-- begin PETCLINIC_ADDRESS
create table PETCLINIC_ADDRESS (
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
    STREET varchar(255),
    POSTCODE varchar(255),
    CITY varchar(255),
    OWNER_ID varchar(36) not null,
    HOUSENUMBER integer,
    HOUSENUMBER_SUFFIX varchar(4),
    --
    primary key (ID)
)^
-- end PETCLINIC_ADDRESS
-- begin PETCLINIC_HEALTH_RECORD
create table PETCLINIC_HEALTH_RECORD (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    RECORD_DATE date not null,
    RESPONSIBLE_VET_ID varchar(36) not null,
    RESPONSIBLE_NURSE varchar(255) not null,
    PET_ID varchar(36) not null,
    VISIT_ID varchar(36),
    ADMINISSION_NOTE longvarchar,
    PROGRESS_NOTE longvarchar,
    OPERATIVE_NOTE longvarchar,
    POSTOPERATIVE_NOTE longvarchar,
    --
    primary key (ID)
)^
-- end PETCLINIC_HEALTH_RECORD
-- begin PETCLINIC_HEALTH_RECORD_ATTACHMENT
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
)^
-- end PETCLINIC_HEALTH_RECORD_ATTACHMENT
-- begin PETCLINIC_EMPLOYEE
create table PETCLINIC_EMPLOYEE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255),
    --
    BIRTHDATE date,
    EMPLOYEE_RECORD_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end PETCLINIC_EMPLOYEE
-- begin PETCLINIC_EMPLOYEE_RECORD
create table PETCLINIC_EMPLOYEE_RECORD (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PERSONELL_NUMBER integer not null,
    AMOUNT_SICK_DAYS integer,
    --
    primary key (ID)
)^
-- end PETCLINIC_EMPLOYEE_RECORD
