package com.company.spmk.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.List;

@Table(name = "SPMK_NHA_CC")
@Entity(name = "spmk_NhaCc")
@NamePattern("%s|maNhaCc")
public class NhaCc extends StandardEntity {
    private static final long serialVersionUID = 1219774243105341022L;

    @Column(name = "MA_NHA_CC", length = 20)
    private String maNhaCc;

    @Column(name = "TEN_NHA_CC")
    private String tenNhaCc;

    @Column(name = "SDT_NHA_CC", length = 20)
    private String sdtNhaCc;

    @JoinTable(name = "SPMK_NHA_CC_HANG_HOA",
            joinColumns = @JoinColumn(name = "NHA_CC_ID"),
            inverseJoinColumns = @JoinColumn(name = "HANG_HOA_ID"))
    @ManyToMany
    private List<HangHoa> hangHoa;

    @Column(name = "DIA_CHI")
    private String diaChi;

    public NhaCc() {};

    public NhaCc(List<String> strArgs) {
        maNhaCc = strArgs.get(0);
        tenNhaCc = strArgs.get(1);
        sdtNhaCc = strArgs.get(2);
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

    public String getSdtNhaCc() {
        return sdtNhaCc;
    }

    public void setSdtNhaCc(String sdtNhaCc) {
        this.sdtNhaCc = sdtNhaCc;
    }

    public String getTenNhaCc() {
        return tenNhaCc;
    }

    public void setTenNhaCc(String tenNhaCc) {
        this.tenNhaCc = tenNhaCc;
    }

    public String getMaNhaCc() {
        return maNhaCc;
    }

    public void setMaNhaCc(String maNhaCc) {
        this.maNhaCc = maNhaCc;
    }
}