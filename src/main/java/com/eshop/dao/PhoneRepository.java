package com.eshop.dao;

import com.eshop.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PhoneRepository extends JpaRepository<Phone,Long>,PhoneRepositoryCustom{
        List<Phone> getAllByColor(String color);
}
