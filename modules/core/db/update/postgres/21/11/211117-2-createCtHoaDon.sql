alter table SPMK_CT_HOA_DON add constraint FK_SPMK_CT_HOA_DON_ON_HOA_DON foreign key (HOA_DON_ID) references SPMK_HOA_DON(ID);
alter table SPMK_CT_HOA_DON add constraint FK_SPMK_CT_HOA_DON_ON_HANG_HOA foreign key (HANG_HOA_ID) references SPMK_HANG_HOA(ID);
create index IDX_SPMK_CT_HOA_DON_ON_HOA_DON on SPMK_CT_HOA_DON (HOA_DON_ID);
create index IDX_SPMK_CT_HOA_DON_ON_HANG_HOA on SPMK_CT_HOA_DON (HANG_HOA_ID);
