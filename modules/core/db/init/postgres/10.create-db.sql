-- begin SPMK_TON_KHO
create table SPMK_TON_KHO (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MA_KHO_ID uuid not null,
    SO_LUONG_TON integer,
    TINH_TRANG varchar(255),
    MA_HANG_ID uuid not null,
    --
    primary key (ID)
)^
-- end SPMK_TON_KHO
-- begin SPMK_HANG_HOA
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
)^
-- end SPMK_HANG_HOA
-- begin SPMK_PHIEU_MUA_HANG
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
    PHIEU_NHAP_ID uuid,
    --
    primary key (ID)
)^
-- end SPMK_PHIEU_MUA_HANG
-- begin SPMK_HOA_DON
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
)^
-- end SPMK_HOA_DON
-- begin SPMK_CT_PHIEU_MUA
create table SPMK_CT_PHIEU_MUA (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PHIEU_MUA_ID uuid not null,
    HANG_HOA_ID uuid not null,
    SO_LUONG integer,
    GHI_CHU varchar(255),
    --
    primary key (ID)
)^
-- end SPMK_CT_PHIEU_MUA
-- begin SPMK_SIEU_THI
create table SPMK_SIEU_THI (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MA_SIEU_THI varchar(20),
    QUAN_LY_TRUONG varchar(255),
    SDT_SIEU_THI varchar(20),
    DIA_CHI varchar(255),
    --
    primary key (ID)
)^
-- end SPMK_SIEU_THI
-- begin SPMK_NHA_CC
create table SPMK_NHA_CC (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MA_NHA_CC varchar(20),
    TEN_NHA_CC varchar(255),
    SDT_NHA_CC varchar(20),
    DIA_CHI varchar(255),
    --
    primary key (ID)
)^
-- end SPMK_NHA_CC
-- begin SPMK_CT_PHIEU_XUAT
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
)^
-- end SPMK_CT_PHIEU_XUAT
-- begin SPMK_CT_PHIEU_NHAP
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
)^
-- end SPMK_CT_PHIEU_NHAP
-- begin SPMK_PHIEU_XUAT_KHO
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
    --
    primary key (ID)
)^
-- end SPMK_PHIEU_XUAT_KHO
-- begin SPMK_PHIEU_NHAP_KHO
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
)^
-- end SPMK_PHIEU_NHAP_KHO
-- begin SPMK_CT_HOA_DON
create table SPMK_CT_HOA_DON (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    HOA_DON_ID uuid not null,
    HANG_HOA_ID uuid not null,
    SO_LUONG integer,
    DON_GIA integer,
    GHI_CHU varchar(255),
    --
    primary key (ID)
)^
-- end SPMK_CT_HOA_DON
-- begin SPMK_KHO
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
)^
-- end SPMK_KHO
-- begin SPMK_NHA_CC_HANG_HOA
create table SPMK_NHA_CC_HANG_HOA (
    NHA_CC_ID uuid,
    HANG_HOA_ID uuid,
    primary key (NHA_CC_ID, HANG_HOA_ID)
)^
-- end SPMK_NHA_CC_HANG_HOA
-- begin SPMK_SIEU_THI_HANG_HOA
create table SPMK_SIEU_THI_HANG_HOA (
    SIEU_THI_ID uuid,
    HANG_HOA_ID uuid,
    primary key (SIEU_THI_ID, HANG_HOA_ID)
)^
-- end SPMK_SIEU_THI_HANG_HOA
