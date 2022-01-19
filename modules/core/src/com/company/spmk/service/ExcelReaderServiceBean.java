package com.company.spmk.service;

import com.company.spmk.entity.HangHoa;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service(ExcelReaderService.NAME)
public class ExcelReaderServiceBean implements ExcelReaderService {
    @Override
    public List<List<String>> read(File excelFile) throws FileNotFoundException, IOException {
        FileInputStream inputStream = new FileInputStream(excelFile);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);

        List<List<String>> listStrEntity = new ArrayList<>();
        int maxCol = -1;
        for (Row row : sheet) {
            if (maxCol < 0) {
                maxCol = row.getLastCellNum(); // get max column and skip header
                continue;
            }
            ArrayList<String> listStrArgs = new ArrayList<>();
            for (int i = 0; i < maxCol; i++) {
                Cell cell = row.getCell(i, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                if (cell != null)
                    listStrArgs.add(cell.getStringCellValue());
                else
                    listStrArgs.add("");
            }
            listStrEntity.add(listStrArgs);
        }
        return listStrEntity;
    }
}