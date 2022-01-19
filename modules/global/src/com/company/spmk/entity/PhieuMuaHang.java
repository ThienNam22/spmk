package com.company.spmk.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Table(name = "SPMK_PHIEU_MUA_HANG")
@Entity(name = "spmk_PhieuMuaHang")
@NamePattern("%s|maPhieuMua")
public class PhieuMuaHang extends StandardEntity {
    private static final long serialVersionUID = -1712083771887374128L;

    @Column(name = "MA_PHIEU_MUA", length = 20)
    private String maPhieuMua;

    @NotNull
    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "NHA_CC_ID")
    private NhaCc nhaCc;

    @NotNull
    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "KHO_ID")
    private Kho kho;

    @Column(name = "THANH_TOAN")
    private String thanhToan;

    @Column(name = "NGAY_LAP")
    private LocalDateTime ngayLap;

    @Column(name = "MA_NHAN_VIEN")
    private String maNhanVien;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PHIEU_NHAP_ID")
    private PhieuNhapKho phieuNhap;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "phieuMua")
    private HoaDon hoaDon;

    public PhieuNhapKho getPhieuNhap() {
        return phieuNhap;
    }

    public void setPhieuNhap(PhieuNhapKho phieuNhap) {
        this.phieuNhap = phieuNhap;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
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

    public String getThanhToan() {
        return thanhToan;
    }

    public void setThanhToan(String thanhToan) {
        this.thanhToan = thanhToan;
    }

    public Kho getKho() {
        return kho;
    }

    public void setKho(Kho kho) {
        this.kho = kho;
    }

    public NhaCc getNhaCc() {
        return nhaCc;
    }

    public void setNhaCc(NhaCc nhaCc) {
        this.nhaCc = nhaCc;
    }

    public String getMaPhieuMua() {
        return maPhieuMua;
    }

    public void setMaPhieuMua(String maPhieuMua) {
        this.maPhieuMua = maPhieuMua;
    }
}