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
);