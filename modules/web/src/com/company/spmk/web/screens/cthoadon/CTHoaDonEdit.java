package com.company.spmk.web.screens.cthoadon;

import com.haulmont.cuba.gui.screen.*;
import com.company.spmk.entity.CTHoaDon;

@UiController("spmk_CTHoaDon.edit")
@UiDescriptor("ct-hoa-don-edit.xml")
@EditedEntityContainer("cTHoaDonDc")
@LoadDataBeforeShow
public class CTHoaDonEdit extends StandardEditor<CTHoaDon> {
}