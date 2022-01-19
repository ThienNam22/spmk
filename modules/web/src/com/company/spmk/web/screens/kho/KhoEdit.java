package com.company.spmk.web.screens.kho;

import com.haulmont.cuba.gui.screen.*;
import com.company.spmk.entity.Kho;

@UiController("spmk_Kho.edit")
@UiDescriptor("kho-edit.xml")
@EditedEntityContainer("khoDc")
@LoadDataBeforeShow
public class KhoEdit extends StandardEditor<Kho> {
}