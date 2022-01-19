package com.company.spmk.web.screens.nhacc;

import com.company.spmk.service.ExcelReaderService;
import com.company.spmk.service.NhaCcService;
import com.haulmont.cuba.gui.Dialogs;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.FileUploadField;
import com.haulmont.cuba.gui.screen.*;
import com.company.spmk.entity.NhaCc;
import com.haulmont.cuba.gui.upload.FileUploadingAPI;

import javax.inject.Inject;
import java.io.File;

@UiController("spmk_NhaCc.browse")
@UiDescriptor("nha-cc-browse.xml")
@LookupComponent("nhaCcsTable")
@LoadDataBeforeShow
public class NhaCcBrowse extends StandardLookup<NhaCc> {
    @Inject
    private FileUploadingAPI fileUploadingAPI;
    @Inject
    private FileUploadField nhaCcUpload;
    @Inject
    private NhaCcService nhaCcService;
    @Inject
    private ExcelReaderService excelReaderService;
    @Inject
    private Dialogs dialogs;
    @Inject
    private Notifications notifications;

    @Subscribe("nhaCcUpload")
    public void onNhaCcUploadFileUploadSucceed(FileUploadField.FileUploadSucceedEvent event) {
        File excel = fileUploadingAPI.getFile(nhaCcUpload.getFileId());
        try {
            int recordsNumber = nhaCcService.saveAllFromStr(excelReaderService.read(excel));
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