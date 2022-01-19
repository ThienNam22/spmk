package com.company.spmk.web.screens.hanghoa;

import com.company.spmk.entity.SieuThi;
import com.company.spmk.service.HangHoaExcelReaderService;
import com.company.spmk.service.HangHoaService;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.Dialogs;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.actions.list.ExcelAction;
import com.haulmont.cuba.gui.app.core.inputdialog.DialogActions;
import com.haulmont.cuba.gui.app.core.inputdialog.InputParameter;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.FileUploadField;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.model.DataContext;
import com.haulmont.cuba.gui.screen.*;
import com.company.spmk.entity.HangHoa;
import com.haulmont.cuba.gui.upload.FileUploadingAPI;
import com.haulmont.cuba.web.gui.facets.InputDialogFacetProvider;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@UiController("spmk_HangHoa.browse")
@UiDescriptor("hang-hoa-browse.xml")
@LookupComponent("hangHoasTable")
@LoadDataBeforeShow
public class HangHoaBrowse extends StandardLookup<HangHoa> {

    @Inject
    private Notifications notifications;
    @Inject
    private Dialogs dialogs;
    @Inject
    private DataContext dataContext;
    @Inject
    private GroupTable<HangHoa> hangHoasTable;
    @Inject
    private HangHoaService hangHoaService;
    @Inject
    private InputDialogFacetProvider inputDialogFacetProvider;
    @Inject
    private FileUploadingAPI fileUploadingAPI;
    @Inject
    private FileUploadField excelUpload;
    @Inject
    private HangHoaExcelReaderService hangHoaExcelReaderService;

    @Subscribe("viewBtn")
    public void onViewBtnClick(Button.ClickEvent event) {
        try {
            HangHoa hangHoa = hangHoasTable.getSingleSelected();
            List<SieuThi> sieuThiList = hangHoa.getSieuThi();
            String msg = "Mat hang nay chua co sieu thi";
            if (sieuThiList != null && sieuThiList.size() > 0) {
                msg = hangHoa.getSieuThi().get(0).toString() + "\nTotal: " + sieuThiList.size();
            }
            dialogs.createMessageDialog(Dialogs.MessageType.CONFIRMATION)
                    .withCaption("Hang Hoa")
                    .withMessage(msg)
                    .show();

        } catch (Exception e) {
            notifications.create(Notifications.NotificationType.WARNING)
                    .withCaption("Error")
                    .withDescription("Please select a record. " + e.getMessage())
                    .show();
        }
    }

    @Subscribe("addMoreBtn")
    public void onAddMoreBtnClick(Button.ClickEvent event) {
        hangHoaService.saveEntity(new HangHoa("HH003", "Keo", "Tui"));
        notifications.create(Notifications.NotificationType.TRAY)
                .withDescription("Done")
                .show();
    }

    @Subscribe("excelUpload")
    public void onExcelUploadFileUploadSucceed(FileUploadField.FileUploadSucceedEvent event) {
        File file = fileUploadingAPI.getFile(excelUpload.getFileId());

        try {
            List<HangHoa> list = hangHoaExcelReaderService.read(file);
            if (list != null)
                notifications.create(Notifications.NotificationType.TRAY)
                        .withDescription("Total records: " + list.size())
                        .show();
        } catch (Exception e) {
            notifications.create(Notifications.NotificationType.TRAY)
                    .withDescription("Error: " + e.getMessage())
                    .show();

        }
    }

}