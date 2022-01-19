create table SPMK_HANG_HOA (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MA_HANG varchar(20),
    TEN_HANG varchar(255),
    DON_VI_TINH varchar(20),
    --
    primary key (ID)
);