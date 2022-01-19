package com.company.spmk.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;

@Table(name = "SPMK_CT_PHIEU_XUAT")
@Entity(name = "spmk_CTPhieuXuat")
public class CTPhieuXuat extends StandardEntity {
    private static final long serialVersionUID = -1480864088508936877L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PHIEU_XUAT_ID")
    private PhieuXuatKho phieuXuat;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HANG_HOA_ID")
    private HangHoa hangHoa;

    @Column(name = "SO_LUONG")
    private Integer soLuong;

    @Column(name = "TINH_TRANG")
    private String tinhTrang;

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public HangHoa getHangHoa() {
        return hangHoa;
    }

    public void setHangHoa(HangHoa hangHoa) {
        this.hangHoa = hangHoa;
    }

    public PhieuXuatKho getPhieuXuat() {
        return phieuXuat;
    }

    public void setPhieuXuat(PhieuXuatKho phieuXuat) {
        this.phieuXuat = phieuXuat;
    }
}