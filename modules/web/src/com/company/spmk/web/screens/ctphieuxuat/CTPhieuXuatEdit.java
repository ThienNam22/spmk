package com.company.spmk.web.screens.ctphieuxuat;

import com.haulmont.cuba.gui.screen.*;
import com.company.spmk.entity.CTPhieuXuat;

@UiController("spmk_CTPhieuXuat.edit")
@UiDescriptor("ct-phieu-xuat-edit.xml")
@EditedEntityContainer("cTPhieuXuatDc")
@LoadDataBeforeShow
public class CTPhieuXuatEdit extends StandardEditor<CTPhieuXuat> {
}