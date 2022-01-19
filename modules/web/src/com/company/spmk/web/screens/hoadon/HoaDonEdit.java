package com.company.spmk.web.screens.hoadon;

import com.haulmont.cuba.gui.screen.*;
import com.company.spmk.entity.HoaDon;

@UiController("spmk_HoaDon.edit")
@UiDescriptor("hoa-don-edit.xml")
@EditedEntityContainer("hoaDonDc")
@LoadDataBeforeShow
public class HoaDonEdit extends StandardEditor<HoaDon> {
}