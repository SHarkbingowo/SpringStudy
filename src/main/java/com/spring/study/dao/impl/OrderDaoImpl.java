package com.spring.study.dao.impl;

import com.spring.study.dao.OrderDao;

public class OrderDaoImpl implements OrderDao {

    @Override
    public void save() {
        System.out.println("Hello OrderDao");
    }
}
