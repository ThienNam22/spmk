alter table SPMK_PHIEU_XUAT_KHO add constraint FK_SPMK_PHIEU_XUAT_KHO_ON_SIEU_THI foreign key (SIEU_THI_ID) references SPMK_SIEU_THI(ID);
alter table SPMK_PHIEU_XUAT_KHO add constraint FK_SPMK_PHIEU_XUAT_KHO_ON_KHO foreign key (KHO_ID) references SPMK_KHO(ID);
alter table SPMK_PHIEU_XUAT_KHO add constraint FK_SPMK_PHIEU_XUAT_KHO_ON_PHIEU_MUA foreign key (PHIEU_MUA_ID) references SPMK_PHIEU_MUA_HANG(ID);
create index IDX_SPMK_PHIEU_XUAT_KHO_ON_SIEU_THI on SPMK_PHIEU_XUAT_KHO (SIEU_THI_ID);
create index IDX_SPMK_PHIEU_XUAT_KHO_ON_KHO on SPMK_PHIEU_XUAT_KHO (KHO_ID);
create index IDX_SPMK_PHIEU_XUAT_KHO_ON_PHIEU_MUA on SPMK_PHIEU_XUAT_KHO (PHIEU_MUA_ID);
