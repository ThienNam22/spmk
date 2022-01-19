package com.company.spmk.web.screens.sieuthi;

import com.company.spmk.service.ExcelReaderService;
import com.company.spmk.service.SieuThiService;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.Dialogs;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.FileUploadField;
import com.haulmont.cuba.gui.screen.*;
import com.company.spmk.entity.SieuThi;
import com.haulmont.cuba.gui.upload.FileUploadingAPI;

import javax.inject.Inject;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@UiController("spmk_SieuThi.browse")
@UiDescriptor("sieu-thi-browse.xml")
@LookupComponent("sieuThisTable")
@LoadDataBeforeShow
public class SieuThiBrowse extends StandardLookup<SieuThi> {
    @Inject
    private SieuThiService sieuThiService;
    @Inject
    private DataManager dataManager;
    @Inject
    private FileUploadingAPI fileUploadingAPI;
    @Inject
    private FileUploadField sieuThiUpload;
    @Inject
    private ExcelReaderService excelReaderService;
    @Inject
    private Dialogs dialogs;
    @Inject
    private Notifications notifications;


    @Subscribe("addListBtn")
    public void onAddListBtnClick(Button.ClickEvent event) {
        List<SieuThi> list = new ArrayList<>();
        list.add(new SieuThi("ST002", "Quan ly 1", "0999999999", "Ha Noi"));
        list.add(new SieuThi("ST003", "Quan ly 2", "0989898989", "Tp. HCM"));
        sieuThiService.saveAll(list);
    }

    @Subscribe("sieuThiUpload")
    public void onSieuThiUploadFileUploadSucceed(FileUploadField.FileUploadSucceedEvent event) {
        File excel = fileUploadingAPI.getFile(sieuThiUpload.getFileId());
        try {
            int recordsNumber = sieuThiService.saveAllFromStr(excelReaderService.read(excel));
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