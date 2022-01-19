alter table SPMK_TON_KHO add constraint FK_SPMK_TON_KHO_ON_MA_KHO foreign key (MA_KHO_ID) references SPMK_KHO(ID);
alter table SPMK_TON_KHO add constraint FK_SPMK_TON_KHO_ON_MA_HANG foreign key (MA_HANG_ID) references SPMK_HANG_HOA(ID);
create index IDX_SPMK_TON_KHO_ON_MA_KHO on SPMK_TON_KHO (MA_KHO_ID);
create index IDX_SPMK_TON_KHO_ON_MA_HANG on SPMK_TON_KHO (MA_HANG_ID);
