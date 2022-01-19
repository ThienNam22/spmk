package com.company.spmk.entity;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Table(name = "SPMK_HOA_DON")
@Entity(name = "spmk_HoaDon")
public class HoaDon extends StandardEntity {
    private static final long serialVersionUID = -314173450382624909L;

    @Column(name = "MA_HOA_DON", length = 20)
    private String maHoaDon;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PHIEU_MUA_ID")
    private PhieuMuaHang phieuMua;

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

    @Column(name = "NGAY_GIAO")
    private LocalDateTime ngayGiao;

    @Column(name = "NGAY_LAP")
    private LocalDateTime ngayLap;

    @Column(name = "NGUOI_LAP")
    private String nguoiLap;

    @Transient
    @MetaProperty
    private Integer tongTien;

    public Integer getTongTien() {
        return tongTien;
    }

    public void setTongTien(Integer tongTien) {
        this.tongTien = tongTien;
    }

    public String getNguoiLap() {
        return nguoiLap;
    }

    public void setNguoiLap(String nguoiLap) {
        this.nguoiLap = nguoiLap;
    }

    public LocalDateTime getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(LocalDateTime ngayLap) {
        this.ngayLap = ngayLap;
    }

    public LocalDateTime getNgayGiao() {
        return ngayGiao;
    }

    public void setNgayGiao(LocalDateTime ngayGiao) {
        this.ngayGiao = ngayGiao;
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

    public PhieuMuaHang getPhieuMua() {
        return phieuMua;
    }

    public void setPhieuMua(PhieuMuaHang phieuMua) {
        this.phieuMua = phieuMua;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }
}