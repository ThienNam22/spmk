package com.company.spmk.web.screens.phieuxuatkho;

import com.haulmont.cuba.gui.screen.*;
import com.company.spmk.entity.PhieuXuatKho;

@UiController("spmk_PhieuXuatKho.edit")
@UiDescriptor("phieu-xuat-kho-edit.xml")
@EditedEntityContainer("phieuXuatKhoDc")
@LoadDataBeforeShow
public class PhieuXuatKhoEdit extends StandardEditor<PhieuXuatKho> {
}