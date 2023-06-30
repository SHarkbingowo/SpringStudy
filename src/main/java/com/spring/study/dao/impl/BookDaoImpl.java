package com.spring.study.dao.impl;

import com.spring.study.dao.BookDao;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("Hello BookDao");
    }
}
