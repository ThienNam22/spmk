create table SPMK_PHIEU_XUAT_KHO (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MA_PX varchar(20),
    SIEU_THI_ID uuid not null,
    KHO_ID uuid not null,
    NGAY_LAP timestamp,
    MA_NHAN_VIEN varchar(255),
    PHIEU_MUA_ID uuid,
    --
    primary key (ID)
);