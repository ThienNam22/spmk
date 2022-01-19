package com.company.spmk.web.screens.ctphieumua;

import com.haulmont.cuba.gui.screen.*;
import com.company.spmk.entity.CTPhieuMua;

@UiController("spmk_CTPhieuMua.edit")
@UiDescriptor("ct-phieu-mua-edit.xml")
@EditedEntityContainer("cTPhieuMuaDc")
@LoadDataBeforeShow
public class CTPhieuMuaEdit extends StandardEditor<CTPhieuMua> {
}