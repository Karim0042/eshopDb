package com.eshop.dao;

import com.eshop.entity.Computer;
import javax.persistence.*;
import javax.transaction.Transactional;
@Transactional
public class ComputerRepositoryCustomImpl implements ComputerRepositoryCustom{
    @PersistenceContext
    EntityManager em;
    @Override
    public boolean addComputer(Computer computer) {
        em.persist(computer);
        return true;
    }

    @Override
    public boolean updateComputer(Computer computer) {
        em.merge(computer);
        return true;
    }
}
