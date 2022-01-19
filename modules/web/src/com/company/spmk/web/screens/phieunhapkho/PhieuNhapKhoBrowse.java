package com.company.spmk.web.screens.phieunhapkho;

import com.haulmont.cuba.gui.screen.*;
import com.company.spmk.entity.PhieuNhapKho;

@UiController("spmk_PhieuNhapKho.browse")
@UiDescriptor("phieu-nhap-kho-browse.xml")
@LookupComponent("phieuNhapKhoesTable")
@LoadDataBeforeShow
public class PhieuNhapKhoBrowse extends StandardLookup<PhieuNhapKho> {
}