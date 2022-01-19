package com.company.spmk.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "SPMK_CT_PHIEU_NHAP")
@Entity(name = "spmk_CTPhieuNhap")
public class CTPhieuNhap extends StandardEntity {
    private static final long serialVersionUID = 5819814050800290600L;

    @NotNull
    @OnDeleteInverse(DeletePolicy.CASCADE)
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.LAZY, optional = false)
    @JoinColumn(name = "PHIEU_NHAP_ID")
    private PhieuNhapKho phieuNhap;

    @NotNull
    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
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

    public PhieuNhapKho getPhieuNhap() {
        return phieuNhap;
    }

    public void setPhieuNhap(PhieuNhapKho phieuNhap) {
        this.phieuNhap = phieuNhap;
    }
}