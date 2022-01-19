package com.company.spmk.service;

import com.company.spmk.entity.HangHoa;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Transaction;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service(HangHoaService.NAME)
public class HangHoaServiceBean implements HangHoaService {
    @Inject
    private Persistence persistence;

    @Override
    public void saveEntity(HangHoa hangHoa) {
        try (Transaction tx = persistence.createTransaction()) {
            // get EntityManager for the current transaction
            EntityManager em = persistence.getEntityManager();
            // create and execute Query
            em.persist(hangHoa);
            // commit transaction
            tx.commit();
        }
    }
}