package com.company.spmk.web.screens.tonkho;

import com.haulmont.cuba.gui.screen.*;
import com.company.spmk.entity.TonKho;

@UiController("spmk_TonKho.browse")
@UiDescriptor("ton-kho-browse.xml")
@LookupComponent("tonKhoesTable")
@LoadDataBeforeShow
public class TonKhoBrowse extends StandardLookup<TonKho> {
}