alter table SPMK_SIEU_THI_HANG_HOA add constraint FK_SIETHIHANHOA_ON_SIEU_THI foreign key (SIEU_THI_ID) references SPMK_SIEU_THI(ID);
alter table SPMK_SIEU_THI_HANG_HOA add constraint FK_SIETHIHANHOA_ON_HANG_HOA foreign key (HANG_HOA_ID) references SPMK_HANG_HOA(ID);