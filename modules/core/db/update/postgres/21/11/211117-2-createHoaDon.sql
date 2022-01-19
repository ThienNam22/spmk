alter table SPMK_HOA_DON add constraint FK_SPMK_HOA_DON_ON_PHIEU_MUA foreign key (PHIEU_MUA_ID) references SPMK_PHIEU_MUA_HANG(ID);
alter table SPMK_HOA_DON add constraint FK_SPMK_HOA_DON_ON_NHA_CC foreign key (NHA_CC_ID) references SPMK_NHA_CC(ID);
alter table SPMK_HOA_DON add constraint FK_SPMK_HOA_DON_ON_KHO foreign key (KHO_ID) references SPMK_KHO(ID);
create index IDX_SPMK_HOA_DON_ON_PHIEU_MUA on SPMK_HOA_DON (PHIEU_MUA_ID);
create index IDX_SPMK_HOA_DON_ON_NHA_CC on SPMK_HOA_DON (NHA_CC_ID);
create index IDX_SPMK_HOA_DON_ON_KHO on SPMK_HOA_DON (KHO_ID);
