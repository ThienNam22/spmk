package com.company.spmk.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.List;

@Table(name = "SPMK_HANG_HOA")
@Entity(name = "spmk_HangHoa")
public class HangHoa extends StandardEntity {
    private static final long serialVersionUID = 4634496553414836875L;

    @Column(name = "MA_HANG", length = 20)
    private String maHang;

    @Column(name = "TEN_HANG")
    private String tenHang;

    @Column(name = "DON_VI_TINH", length = 20)
    private String donViTinh;

    @JoinTable(name = "SPMK_SIEU_THI_HANG_HOA",
            joinColumns = @JoinColumn(name = "HANG_HOA_ID"),
            inverseJoinColumns = @JoinColumn(name = "SIEU_THI_ID"))
    @ManyToMany
    private List<SieuThi> sieuThi;

    @JoinTable(name = "SPMK_NHA_CC_HANG_HOA",
            joinColumns = @JoinColumn(name = "HANG_HOA_ID"),
            inverseJoinColumns = @JoinColumn(name = "NHA_CC_ID"))
    @ManyToMany
    private List<NhaCc> nhaCc;

    public HangHoa() {

    }
    public HangHoa(String maHang, String tenHang, String donViTinh) {
        this.maHang = maHang == null ? "" : maHang;
        this.tenHang = tenHang == null ? "" : tenHang;
        this.donViTinh = donViTinh == null ? "" : donViTinh;
    }
    public List<NhaCc> getNhaCc() {
        return nhaCc;
    }

    public void setNhaCc(List<NhaCc> nhaCc) {
        this.nhaCc = nhaCc;
    }

    public List<SieuThi> getSieuThi() {
        return sieuThi;
    }

    public void setSieuThi(List<SieuThi> sieuThi) {
        this.sieuThi = sieuThi;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    @Override
    public String toString() {
        return String.format("Hang hoa:\nTen: %s\nDon vi: %s", tenHang, donViTinh);
    }
}