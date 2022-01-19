create table SPMK_PHIEU_NHAP_KHO (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MA_PN varchar(20),
    KHO_ID uuid not null,
    NHA_CC_ID uuid not null,
    NGAY_LAP timestamp,
    MA_NHAN_VIEN varchar(20),
    --
    primary key (ID)
);