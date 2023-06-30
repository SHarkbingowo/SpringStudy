package com.spring.study.service.impl;

import com.spring.study.dao.BookDao;
import com.spring.study.dao.UserDao;
import com.spring.study.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Autowired
    private UserDao userDao;


    @Override
    public void save() {
        System.out.println("hello BookService");
        bookDao.save();
        userDao.save();
    }

}
