package com.company.spmk.web.screens.hanghoa;

import com.company.spmk.entity.SieuThi;
import com.haulmont.cuba.gui.actions.list.AddAction;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.screen.*;
import com.company.spmk.entity.HangHoa;

import javax.inject.Named;

@UiController("spmk_HangHoa.edit")
@UiDescriptor("hang-hoa-edit.xml")
@EditedEntityContainer("hangHoaDc")
@LoadDataBeforeShow
public class HangHoaEdit extends StandardEditor<HangHoa> {

}