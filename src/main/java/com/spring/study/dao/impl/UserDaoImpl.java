package com.spring.study.dao.impl;

import com.spring.study.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;


@Repository("UserDao")
public class UserDaoImpl implements UserDao {

    @Value("${jdbc.driver}")
    private String driver;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String userName;

    @Value("${jdbc.password}")
    private String passWord;

    @Override
    public void save() {
        System.out.println("Hello UserDaoImpl");
        System.out.println("driver:"+driver);
        System.out.println("url"+url);
        System.out.println("username"+userName);
        System.out.println("password"+passWord);

    }
}
