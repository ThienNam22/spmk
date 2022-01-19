package com.company.spmk.web.screens.ctphieunhap;

import com.haulmont.cuba.gui.screen.*;
import com.company.spmk.entity.CTPhieuNhap;

@UiController("spmk_CTPhieuNhap.edit")
@UiDescriptor("ct-phieu-nhap-edit.xml")
@EditedEntityContainer("cTPhieuNhapDc")
@LoadDataBeforeShow
public class CTPhieuNhapEdit extends StandardEditor<CTPhieuNhap> {
}