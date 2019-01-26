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
);