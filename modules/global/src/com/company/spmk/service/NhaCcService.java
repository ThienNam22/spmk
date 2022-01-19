package com.company.spmk.service;

import com.company.spmk.entity.NhaCc;
import com.company.spmk.entity.SieuThi;

import java.util.List;

public interface NhaCcService {
    String NAME = "spmk_NhaCcService";
    /**
     * Create entity from list String Args and save
     * @param listSE
     * @return int number of records
     */
    int saveAllFromStr(List<List<String>> listSE);

    void saveAll(List<NhaCc> listE);
}