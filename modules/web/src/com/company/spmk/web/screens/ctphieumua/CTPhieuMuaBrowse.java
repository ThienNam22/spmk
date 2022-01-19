package com.company.spmk.web.screens.ctphieumua;

import com.haulmont.cuba.gui.screen.*;
import com.company.spmk.entity.CTPhieuMua;

@UiController("spmk_CTPhieuMua.browse")
@UiDescriptor("ct-phieu-mua-browse.xml")
@LookupComponent("cTPhieuMuasTable")
@LoadDataBeforeShow
public class CTPhieuMuaBrowse extends StandardLookup<CTPhieuMua> {
}