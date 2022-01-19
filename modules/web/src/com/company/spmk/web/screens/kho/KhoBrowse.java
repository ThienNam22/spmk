package com.company.spmk.web.screens.kho;

import com.company.spmk.service.ExcelReaderService;
import com.company.spmk.service.KhoService;
import com.haulmont.cuba.gui.Dialogs;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.FileUploadField;
import com.haulmont.cuba.gui.screen.*;
import com.company.spmk.entity.Kho;
import com.haulmont.cuba.gui.upload.FileUploadingAPI;

import javax.inject.Inject;
import java.io.File;

@UiController("spmk_Kho.browse")
@UiDescriptor("kho-browse.xml")
@LookupComponent("khoesTable")
@LoadDataBeforeShow
public class KhoBrowse extends StandardLookup<Kho> {
    @Inject
    private FileUploadField khoUpload;
    @Inject
    private FileUploadingAPI fileUploadingAPI;
    @Inject
    private KhoService khoService;
    @Inject
    private Dialogs dialogs;
    @Inject
    private Notifications notifications;
    @Inject
    private ExcelReaderService excelReaderService;

    @Subscribe("khoUpload")
    public void onKhoUploadFileUploadSucceed(FileUploadField.FileUploadSucceedEvent event) {
        File excel = fileUploadingAPI.getFile(khoUpload.getFileId());
        try {
            int recordsNumber = khoService.saveAllFromStr(excelReaderService.read(excel));
            notifications.create(Notifications.NotificationType.TRAY)
                    .withCaption("Import Success")
                    .withDescription("Total records: " + recordsNumber)
                    .show();

        } catch (Exception e) {
            dialogs.createExceptionDialog()
                    .withCaption("Alert")
                    .withMessage(e.getMessage())
                    .withThrowable(e)
                    .show();
        }
    }
}