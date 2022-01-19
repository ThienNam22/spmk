package com.company.spmk.service;

import com.company.spmk.entity.Kho;
import com.haulmont.cuba.core.global.CommitContext;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Service(KhoService.NAME)
public class KhoServiceBean implements KhoService {
    @Inject
    private DataManager dataManager;

    @Override
    public int saveAllFromStr(List<List<String>> listSE) {
        List<Kho> listE = new ArrayList<>();
        for (List<String> strArgs : listSE) {
            if (strArgs.size() >= 5)
                listE.add(new Kho(strArgs));
        }
        saveAll(listE);
        return listE.size();
    }

    @Override
    public void saveAll(List<Kho> listE) {
        dataManager.commit(new CommitContext(listE));
    }
}