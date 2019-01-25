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
);