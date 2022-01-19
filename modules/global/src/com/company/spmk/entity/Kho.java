package com.company.spmk.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Table(name = "SPMK_KHO")
@Entity(name = "spmk_Kho")
@NamePattern("%s|maKho")
public class Kho extends StandardEntity {
    private static final long serialVersionUID = 7002141793889648996L;

    @Column(name = "MA_KHO", length = 20)
    private String maKho;

    @Column(name = "TEN_KHO")
    private String tenKho;

    @Column(name = "THU_KHO")
    private String thuKho;

    @Column(name = "SDT_KHO", length = 20)
    private String sdtKho;

    @Column(name = "DIA_CHI")
    private String diaChi;

    public Kho() {};

    public Kho(List<String> strArgs) {
        maKho = strArgs.get(0);
        tenKho = strArgs.get(1);
        thuKho = strArgs.get(2);
        sdtKho = strArgs.get(3);
        diaChi = strArgs.get(4);
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdtKho() {
        return sdtKho;
    }

    public void setSdtKho(String sdtKho) {
        this.sdtKho = sdtKho;
    }

    public String getThuKho() {
        return thuKho;
    }

    public void setThuKho(String thuKho) {
        this.thuKho = thuKho;
    }

    public String getTenKho() {
        return tenKho;
    }

    public void setTenKho(String tenKho) {
        this.tenKho = tenKho;
    }

    public String getMaKho() {
        return maKho;
    }

    public void setMaKho(String maKho) {
        this.maKho = maKho;
    }
}