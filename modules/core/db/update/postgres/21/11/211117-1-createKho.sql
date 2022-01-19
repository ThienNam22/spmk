create table SPMK_KHO (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MA_KHO varchar(20),
    TEN_KHO varchar(255),
    THU_KHO varchar(255),
    SDT_KHO varchar(20),
    DIA_CHI varchar(255),
    --
    primary key (ID)
);