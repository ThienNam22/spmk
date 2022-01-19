alter table SPMK_PHIEU_MUA_HANG add constraint FK_SPMK_PHIEU_MUA_HANG_ON_NHA_CC foreign key (NHA_CC_ID) references SPMK_NHA_CC(ID);
alter table SPMK_PHIEU_MUA_HANG add constraint FK_SPMK_PHIEU_MUA_HANG_ON_KHO foreign key (KHO_ID) references SPMK_KHO(ID);
create index IDX_SPMK_PHIEU_MUA_HANG_ON_NHA_CC on SPMK_PHIEU_MUA_HANG (NHA_CC_ID);
create index IDX_SPMK_PHIEU_MUA_HANG_ON_KHO on SPMK_PHIEU_MUA_HANG (KHO_ID);
