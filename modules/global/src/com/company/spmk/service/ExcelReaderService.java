package com.company.spmk.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface ExcelReaderService {
    String NAME = "spmk_ExcelReaderService";
    List<List<String>> read(File excelFile) throws FileNotFoundException, IOException;
}