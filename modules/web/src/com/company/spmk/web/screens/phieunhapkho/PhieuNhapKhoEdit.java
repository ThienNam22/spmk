package com.company.spmk.web.screens.phieunhapkho;

import com.haulmont.cuba.gui.screen.*;
import com.company.spmk.entity.PhieuNhapKho;

@UiController("spmk_PhieuNhapKho.edit")
@UiDescriptor("phieu-nhap-kho-edit.xml")
@EditedEntityContainer("phieuNhapKhoDc")
@LoadDataBeforeShow
public class PhieuNhapKhoEdit extends StandardEditor<PhieuNhapKho> {
}