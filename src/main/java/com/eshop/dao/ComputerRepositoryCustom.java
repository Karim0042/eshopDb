package com.eshop.dao;

import com.eshop.entity.Computer;

public interface ComputerRepositoryCustom {
    boolean addComputer(Computer computer);

    boolean updateComputer(Computer computer);
}
