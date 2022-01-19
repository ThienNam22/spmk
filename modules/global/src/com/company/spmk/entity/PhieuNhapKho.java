package com.company.spmk.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Table(name = "SPMK_PHIEU_NHAP_KHO")
@Entity(name = "spmk_PhieuNhapKho")
@NamePattern("%s|maPN")
public class PhieuNhapKho extends StandardEntity {
    private static final long serialVersionUID = -689542427728469518L;

    @Column(name = "MA_PN", length = 20)
    private String maPN;

    @NotNull
    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "KHO_ID")
    private Kho kho;

    @NotNull
    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "NHA_CC_ID")
    private NhaCc nhaCc;

    @Column(name = "NGAY_LAP")
    private LocalDateTime ngayLap;

    @Column(name = "MA_NHAN_VIEN", length = 20)
    private String maNhanVien;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "phieuNhap")
    private PhieuMuaHang phieuMuaHang;

    public PhieuMuaHang getPhieuMuaHang() {
        return phieuMuaHang;
    }

    public void setPhieuMuaHang(PhieuMuaHang phieuMuaHang) {
        this.phieuMuaHang = phieuMuaHang;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public LocalDateTime getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(LocalDateTime ngayLap) {
        this.ngayLap = ngayLap;
    }

    public NhaCc getNhaCc() {
        return nhaCc;
    }

    public void setNhaCc(NhaCc nhaCc) {
        this.nhaCc = nhaCc;
    }

    public Kho getKho() {
        return kho;
    }

    public void setKho(Kho kho) {
        this.kho = kho;
    }

    public String getMaPN() {
        return maPN;
    }

    public void setMaPN(String maPN) {
        this.maPN = maPN;
    }
}