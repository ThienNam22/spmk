create table SPMK_PHIEU_MUA_HANG (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MA_PHIEU_MUA varchar(20),
    NHA_CC_ID uuid not null,
    KHO_ID uuid not null,
    THANH_TOAN varchar(255),
    NGAY_LAP timestamp,
    MA_NHAN_VIEN varchar(255),
    --
    primary key (ID)
);