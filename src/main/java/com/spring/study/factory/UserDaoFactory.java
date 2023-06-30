package com.spring.study.factory;

import com.spring.study.dao.impl.OrderDaoImpl;
import com.spring.study.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDaoImpl getUserDao(){
        return new UserDaoImpl();
    }
}
