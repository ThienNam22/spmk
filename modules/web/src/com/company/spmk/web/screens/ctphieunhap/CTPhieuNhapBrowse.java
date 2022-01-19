package com.company.spmk.web.screens.ctphieunhap;

import com.haulmont.cuba.gui.screen.*;
import com.company.spmk.entity.CTPhieuNhap;

@UiController("spmk_CTPhieuNhap.browse")
@UiDescriptor("ct-phieu-nhap-browse.xml")
@LookupComponent("cTPhieuNhapsTable")
@LoadDataBeforeShow
public class CTPhieuNhapBrowse extends StandardLookup<CTPhieuNhap> {
}