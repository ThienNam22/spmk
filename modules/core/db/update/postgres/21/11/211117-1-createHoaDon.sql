create table SPMK_HOA_DON (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MA_HOA_DON varchar(20),
    PHIEU_MUA_ID uuid,
    NHA_CC_ID uuid not null,
    KHO_ID uuid not null,
    NGAY_GIAO timestamp,
    NGAY_LAP timestamp,
    NGUOI_LAP varchar(255),
    --
    primary key (ID)
);