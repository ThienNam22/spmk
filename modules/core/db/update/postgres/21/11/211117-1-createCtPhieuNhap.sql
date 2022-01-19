create table SPMK_CT_PHIEU_NHAP (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PHIEU_NHAP_ID uuid not null,
    HANG_HOA_ID uuid not null,
    SO_LUONG integer,
    TINH_TRANG varchar(255),
    --
    primary key (ID)
);