package com.company.spmk.web.screens.sieuthi;

import com.haulmont.cuba.gui.screen.*;
import com.company.spmk.entity.SieuThi;

@UiController("spmk_SieuThi.edit")
@UiDescriptor("sieu-thi-edit.xml")
@EditedEntityContainer("sieuThiDc")
@LoadDataBeforeShow
public class SieuThiEdit extends StandardEditor<SieuThi> {
}