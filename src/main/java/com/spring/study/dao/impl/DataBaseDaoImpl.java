package com.spring.study.dao.impl;

import com.alibaba.druid.pool.DruidDataSource;
import com.spring.study.dao.DataBaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import javax.sql.DataSource;


@Component
public class DataBaseDaoImpl implements DataBaseDao {

    @Autowired
    private DataSource druidDataSource;

    @Override
    public void save() {
        System.out.println(druidDataSource.toString());
    }

}
