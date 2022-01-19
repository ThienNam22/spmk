package com.company.spmk.service;

import com.company.spmk.entity.NhaCc;
import com.company.spmk.entity.SieuThi;
import com.haulmont.cuba.core.global.CommitContext;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Service(NhaCcService.NAME)
public class NhaCcServiceBean implements NhaCcService {
    @Inject
    private DataManager dataManager;

    @Override
    public int saveAllFromStr(List<List<String>> listSE) {
        List<NhaCc> listE = new ArrayList<>();
        for (List<String> strArgs : listSE) {
            if (strArgs.size() >= 4)
                listE.add(new NhaCc(strArgs));
        }
        saveAll(listE);
        return listE.size();
    }

    @Override
    public void saveAll(List<NhaCc> listE) {
        dataManager.commit(new CommitContext(listE));
    }
}