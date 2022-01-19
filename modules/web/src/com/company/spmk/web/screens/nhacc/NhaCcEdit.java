package com.company.spmk.web.screens.nhacc;

import com.haulmont.cuba.gui.screen.*;
import com.company.spmk.entity.NhaCc;

@UiController("spmk_NhaCc.edit")
@UiDescriptor("nha-cc-edit.xml")
@EditedEntityContainer("nhaCcDc")
@LoadDataBeforeShow
public class NhaCcEdit extends StandardEditor<NhaCc> {
}