package com.company.spmk.web.screens.phieumuahang;

import com.haulmont.cuba.gui.screen.*;
import com.company.spmk.entity.PhieuMuaHang;

@UiController("spmk_PhieuMuaHang.browse")
@UiDescriptor("phieu-mua-hang-browse.xml")
@LookupComponent("phieuMuaHangsTable")
@LoadDataBeforeShow
public class PhieuMuaHangBrowse extends StandardLookup<PhieuMuaHang> {

}