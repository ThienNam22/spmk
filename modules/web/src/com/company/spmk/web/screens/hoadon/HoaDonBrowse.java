package com.company.spmk.web.screens.hoadon;

import com.haulmont.cuba.gui.screen.*;
import com.company.spmk.entity.HoaDon;

@UiController("spmk_HoaDon.browse")
@UiDescriptor("hoa-don-browse.xml")
@LookupComponent("hoaDonsTable")
@LoadDataBeforeShow
public class HoaDonBrowse extends StandardLookup<HoaDon> {
}