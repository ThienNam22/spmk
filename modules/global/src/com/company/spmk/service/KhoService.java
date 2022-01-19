package com.company.spmk.service;

import com.company.spmk.entity.Kho;
import com.company.spmk.entity.NhaCc;

import java.util.List;

public interface KhoService {
    String NAME = "spmk_KhoService";

    /**
     * Create entity from list String Args and save
     * @param listSE
     * @return int number of records
     */
    int saveAllFromStr(List<List<String>> listSE);

    void saveAll(List<Kho> listE);
}