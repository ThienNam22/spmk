alter table SPMK_CT_PHIEU_NHAP add constraint FK_SPMK_CT_PHIEU_NHAP_ON_PHIEU_NHAP foreign key (PHIEU_NHAP_ID) references SPMK_PHIEU_NHAP_KHO(ID);
alter table SPMK_CT_PHIEU_NHAP add constraint FK_SPMK_CT_PHIEU_NHAP_ON_HANG_HOA foreign key (HANG_HOA_ID) references SPMK_HANG_HOA(ID);
create index IDX_SPMK_CT_PHIEU_NHAP_ON_PHIEU_NHAP on SPMK_CT_PHIEU_NHAP (PHIEU_NHAP_ID);
create index IDX_SPMK_CT_PHIEU_NHAP_ON_HANG_HOA on SPMK_CT_PHIEU_NHAP (HANG_HOA_ID);
