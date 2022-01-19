package com.company.spmk.web.screens.phieuxuatkho;

import com.haulmont.cuba.gui.screen.*;
import com.company.spmk.entity.PhieuXuatKho;

@UiController("spmk_PhieuXuatKho.browse")
@UiDescriptor("phieu-xuat-kho-browse.xml")
@LookupComponent("phieuXuatKhoesTable")
@LoadDataBeforeShow
public class PhieuXuatKhoBrowse extends StandardLookup<PhieuXuatKho> {
}