package com.company.spmk.web.screens.phieumuahang;

import com.company.spmk.entity.HoaDon;
import com.company.spmk.web.screens.hoadon.HoaDonEdit;
import com.haulmont.cuba.gui.Dialogs;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.app.core.inputdialog.DialogActions;
import com.haulmont.cuba.gui.components.Actions;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.DateField;
import com.haulmont.cuba.gui.components.DialogAction;
import com.haulmont.cuba.gui.screen.*;
import com.company.spmk.entity.PhieuMuaHang;

import javax.inject.Inject;
import javax.sound.midi.Track;
import java.time.LocalDateTime;

@UiController("spmk_PhieuMuaHang.edit")
@UiDescriptor("phieu-mua-hang-edit.xml")
@EditedEntityContainer("phieuMuaHangDc")
@LoadDataBeforeShow
public class PhieuMuaHangEdit extends StandardEditor<PhieuMuaHang> {
    @Inject
    private Dialogs dialogs;
    @Inject
    private Notifications notifications;
    @Inject
    private DateField<LocalDateTime> ngayLapField;
    @Inject
    private Actions actions;
    @Inject
    private ScreenBuilders screenBuilders;

    @Subscribe
    public void onAfterCommitChanges(AfterCommitChangesEvent event) {
        dialogs.createOptionDialog()
                .withType(Dialogs.MessageType.CONFIRMATION)
                .withCaption("Question")
                .withMessage("Co muon tao hoa don khong?")
                .withActions(
                        new DialogAction(DialogAction.Type.YES).withHandler(e -> {
                            // YES option selected
                            notifications.create(Notifications.NotificationType.TRAY)
                                    .withDescription("Yes")
                                    .show();
                            screenBuilders.editor(HoaDon.class, this)
                                    .editEntity(new HoaDon())
                                    .build()
                                    .show();
                        }),
                        new DialogAction(DialogAction.Type.NO).withHandler(e -> {})
                )
                .show();
    }

    @Subscribe("getDateBtn")
    public void onGetDateBtnClick(Button.ClickEvent event) {
        ngayLapField.setValue(LocalDateTime.now());
    }
    
}