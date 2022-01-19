package com.company.spmk.service;

import com.company.spmk.entity.SieuThi;

import java.util.List;

public interface SieuThiService {
    String NAME = "spmk_SieuThiService";

    /**
     * Create entity from list String Args and save
     * @param listSE
     * @return int number of records
     */
    int saveAllFromStr(List<List<String>> listSE);

    void saveAll(List<SieuThi> listE);
}