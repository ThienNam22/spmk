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
);