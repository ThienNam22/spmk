package com.company.spmk.web.screens.tonkho;

import com.haulmont.cuba.gui.screen.*;
import com.company.spmk.entity.TonKho;

@UiController("spmk_TonKho.edit")
@UiDescriptor("ton-kho-edit.xml")
@EditedEntityContainer("tonKhoDc")
@LoadDataBeforeShow
public class TonKhoEdit extends StandardEditor<TonKho> {
}