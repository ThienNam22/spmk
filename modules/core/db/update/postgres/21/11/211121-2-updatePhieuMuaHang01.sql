alter table SPMK_PHIEU_MUA_HANG add constraint FK_SPMK_PHIEU_MUA_HANG_ON_PHIEU_NHAP foreign key (PHIEU_NHAP_ID) references SPMK_PHIEU_NHAP_KHO(ID);
create index IDX_SPMK_PHIEU_MUA_HANG_ON_PHIEU_NHAP on SPMK_PHIEU_MUA_HANG (PHIEU_NHAP_ID);
