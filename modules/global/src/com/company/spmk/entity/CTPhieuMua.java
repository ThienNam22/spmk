package com.company.spmk.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "SPMK_CT_PHIEU_MUA")
@Entity(name = "spmk_CTPhieuMua")
public class CTPhieuMua extends StandardEntity {
    private static final long serialVersionUID = -5804844759350815033L;

    @NotNull
    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PHIEU_MUA_ID")
    private PhieuMuaHang phieuMua;

    @NotNull
    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "HANG_HOA_ID")
    private HangHoa hangHoa;

    @Column(name = "SO_LUONG")
    private Integer soLuong;

    @Column(name = "GHI_CHU")
    private String ghiChu;

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
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

    public PhieuMuaHang getPhieuMua() {
        return phieuMua;
    }

    public void setPhieuMua(PhieuMuaHang phieuMua) {
        this.phieuMua = phieuMua;
    }
}