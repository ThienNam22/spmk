package com.company.spmk.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.List;

@Table(name = "SPMK_SIEU_THI")
@Entity(name = "spmk_SieuThi")
public class SieuThi extends StandardEntity {
    private static final long serialVersionUID = -2493742211725987879L;

    @Column(name = "MA_SIEU_THI", length = 20)
    private String maSieuThi;

    @Column(name = "QUAN_LY_TRUONG")
    private String quanLyTruong;

    @Column(name = "SDT_SIEU_THI", length = 20)
    private String sdtSieuThi;

    @Column(name = "DIA_CHI")
    private String diaChi;

    @JoinTable(name = "SPMK_SIEU_THI_HANG_HOA",
            joinColumns = @JoinColumn(name = "SIEU_THI_ID"),
            inverseJoinColumns = @JoinColumn(name = "HANG_HOA_ID"))
    @ManyToMany
    private List<HangHoa> hangHoa;

    public SieuThi() {};

    public SieuThi(String maSieuThi, String quanLyTruong, String sdtSieuThi, String diaChi) {
        this.maSieuThi = maSieuThi;
        this.quanLyTruong = quanLyTruong;
        this.sdtSieuThi = sdtSieuThi;
        this.diaChi = diaChi;
    }

    public SieuThi(List<String> strArgs) {
        maSieuThi = strArgs.get(0);
        quanLyTruong = strArgs.get(1);
        sdtSieuThi = strArgs.get(2);
        diaChi = strArgs.get(3);
    }

    public List<HangHoa> getHangHoa() {
        return hangHoa;
    }

    public void setHangHoa(List<HangHoa> hangHoa) {
        this.hangHoa = hangHoa;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdtSieuThi() {
        return sdtSieuThi;
    }

    public void setSdtSieuThi(String sdtSieuThi) {
        this.sdtSieuThi = sdtSieuThi;
    }

    public String getQuanLyTruong() {
        return quanLyTruong;
    }

    public void setQuanLyTruong(String quanLyTruong) {
        this.quanLyTruong = quanLyTruong;
    }

    public String getMaSieuThi() {
        return maSieuThi;
    }

    public void setMaSieuThi(String maSieuThi) {
        this.maSieuThi = maSieuThi;
    }

    @Override
    public String toString() {
        return String.format("Sieu Thi[maSieuThi=%s, quanLy=%s, sdt=%s, diaChi=%s]", maSieuThi, quanLyTruong, sdtSieuThi, diaChi);
    }
}