package com.company.spmk.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "SPMK_TON_KHO")
@Entity(name = "spmk_TonKho")
public class TonKho extends StandardEntity {
    private static final long serialVersionUID = 6818395640662526924L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MA_KHO_ID")
    @OnDeleteInverse(DeletePolicy.CASCADE)
    private Kho kho;

    @Column(name = "SO_LUONG_TON")
    private Integer soLuongTon;

    @Column(name = "TINH_TRANG")
    private String tinhTrang;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MA_HANG_ID")
    @NotNull
    @OnDeleteInverse(DeletePolicy.CASCADE)
    private HangHoa hangHoa;

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public Integer getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(Integer soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public HangHoa getHangHoa() {
        return hangHoa;
    }

    public void setHangHoa(HangHoa hangHoa) {
        this.hangHoa = hangHoa;
    }

    public Kho getKho() {
        return kho;
    }

    public void setKho(Kho kho) {
        this.kho = kho;
    }
}