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
);