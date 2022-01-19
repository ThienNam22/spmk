alter table SPMK_PHIEU_NHAP_KHO add constraint FK_SPMK_PHIEU_NHAP_KHO_ON_KHO foreign key (KHO_ID) references SPMK_KHO(ID);
alter table SPMK_PHIEU_NHAP_KHO add constraint FK_SPMK_PHIEU_NHAP_KHO_ON_NHA_CC foreign key (NHA_CC_ID) references SPMK_NHA_CC(ID);
create index IDX_SPMK_PHIEU_NHAP_KHO_ON_KHO on SPMK_PHIEU_NHAP_KHO (KHO_ID);
create index IDX_SPMK_PHIEU_NHAP_KHO_ON_NHA_CC on SPMK_PHIEU_NHAP_KHO (NHA_CC_ID);
