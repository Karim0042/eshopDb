package com.eshop.dao;

import com.eshop.entity.Phone;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
public class PhoneRepositoryCustomImpl implements PhoneRepositoryCustom{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public boolean addPhone(Phone phone) {
        entityManager.persist(phone);
        return true;
    }

    @Override
    public boolean updatePhone(Phone phone) {
        entityManager.merge(phone);
        return true;
    }
}
