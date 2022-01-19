package com.company.spmk.web.screens.cthoadon;

import com.haulmont.cuba.gui.screen.*;
import com.company.spmk.entity.CTHoaDon;

@UiController("spmk_CTHoaDon.browse")
@UiDescriptor("ct-hoa-don-browse.xml")
@LookupComponent("cTHoaDonsTable")
@LoadDataBeforeShow
public class CTHoaDonBrowse extends StandardLookup<CTHoaDon> {
}