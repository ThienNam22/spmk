alter table SPMK_PHIEU_XUAT_KHO rename column phieu_mua_id to phieu_mua_id__u80132 ;
alter table SPMK_PHIEU_XUAT_KHO drop constraint FK_SPMK_PHIEU_XUAT_KHO_ON_PHIEU_MUA ;
drop index IDX_SPMK_PHIEU_XUAT_KHO_ON_PHIEU_MUA ;
