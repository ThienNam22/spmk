create table SPMK_CT_PHIEU_XUAT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PHIEU_XUAT_ID uuid,
    HANG_HOA_ID uuid,
    SO_LUONG integer,
    TINH_TRANG varchar(255),
    --
    primary key (ID)
);