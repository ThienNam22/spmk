alter table SPMK_NHA_CC_HANG_HOA add constraint FK_NHACCHANHOA_ON_NHA_CC foreign key (NHA_CC_ID) references SPMK_NHA_CC(ID);
alter table SPMK_NHA_CC_HANG_HOA add constraint FK_NHACCHANHOA_ON_HANG_HOA foreign key (HANG_HOA_ID) references SPMK_HANG_HOA(ID);