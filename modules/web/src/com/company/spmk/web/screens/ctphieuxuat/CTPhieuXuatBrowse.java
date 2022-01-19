package com.company.spmk.web.screens.ctphieuxuat;

import com.haulmont.cuba.gui.screen.*;
import com.company.spmk.entity.CTPhieuXuat;

@UiController("spmk_CTPhieuXuat.browse")
@UiDescriptor("ct-phieu-xuat-browse.xml")
@LookupComponent("cTPhieuXuatsTable")
@LoadDataBeforeShow
public class CTPhieuXuatBrowse extends StandardLookup<CTPhieuXuat> {
}