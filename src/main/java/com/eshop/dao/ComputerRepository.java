package com.eshop.dao;

import com.eshop.entity.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComputerRepository extends JpaRepository<Computer,Long>,ComputerRepositoryCustom{
    List<Computer> findAllByBrand(String brand);
    List<Computer> findAllByRam(int ram);
    List<Computer> findAllByColor(String color);
}
