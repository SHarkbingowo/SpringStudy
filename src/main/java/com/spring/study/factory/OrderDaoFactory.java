package com.spring.study.factory;

import com.spring.study.dao.OrderDao;
import com.spring.study.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        System.out.println("Hello OrderDaoFactory");
        return new OrderDaoImpl();
    }
}
