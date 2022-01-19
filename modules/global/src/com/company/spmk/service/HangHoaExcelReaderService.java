package com.company.spmk.service;

import com.company.spmk.entity.HangHoa;

import java.io.File;
import java.util.List;

public interface HangHoaExcelReaderService {
    String NAME = "spmk_HangHoaExcelReaderService";
    List<HangHoa> read(File excelFile) throws Exception;
}