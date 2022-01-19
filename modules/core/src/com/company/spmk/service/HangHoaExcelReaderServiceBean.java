package com.company.spmk.service;

import com.company.spmk.entity.HangHoa;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Transaction;
import com.haulmont.cuba.core.global.DataManager;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.persistence.queries.LoadGroup;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

@Service(HangHoaExcelReaderService.NAME)
public class HangHoaExcelReaderServiceBean implements HangHoaExcelReaderService {
    @Inject
    private DataManager dataManager;
    @Inject
    private Persistence persistence;

    @Override
    public List<HangHoa> read(File excelFile) throws Exception {
        List<HangHoa> hangHoaList = new ArrayList<>();

        Transaction tx = persistence.createTransaction();
        EntityManager em = persistence.getEntityManager();
        FileInputStream inputStream = new FileInputStream(excelFile);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);

        int maxCol = -1;
        for (Row row : sheet) {
            if (maxCol < 0) {
                maxCol = row.getLastCellNum();
                continue;
            }
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < maxCol; i++) {
                Cell cell = row.getCell(i, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                if (cell != null)
                    list.add(cell.getStringCellValue());
                else
                    list.add("");
            }
            HangHoa hangHoa = new HangHoa(list.get(0), list.get(1), list.get(2));
            hangHoaList.add(hangHoa);
            em.persist(hangHoa);
        }
        tx.commit();
        return hangHoaList;

    }
}