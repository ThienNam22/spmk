package com.company.spmk.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Table(name = "SPMK_PHIEU_XUAT_KHO")
@Entity(name = "spmk_PhieuXuatKho")
public class PhieuXuatKho extends StandardEntity {
    private static final long serialVersionUID = -2656620521084956486L;

    @Column(name = "MA_PX", length = 20)
    private String maPX;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SIEU_THI_ID")
    private SieuThi sieuThi;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "KHO_ID")
    private Kho kho;

    @Column(name = "NGAY_LAP")
    private LocalDateTime ngayLap;

    @Column(name = "MA_NHAN_VIEN")
    private String maNhanVien;

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

    public Kho getKho() {
        return kho;
    }

    public void setKho(Kho kho) {
        this.kho = kho;
    }

    public SieuThi getSieuThi() {
        return sieuThi;
    }

    public void setSieuThi(SieuThi sieuThi) {
        this.sieuThi = sieuThi;
    }

    public String getMaPX() {
        return maPX;
    }

    public void setMaPX(String maPX) {
        this.maPX = maPX;
    }
}