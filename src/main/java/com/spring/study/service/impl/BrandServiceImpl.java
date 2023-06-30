package com.spring.study.service.impl;

import com.spring.study.dao.BrandDao;
import com.spring.study.domain.Brand;
import com.spring.study.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandDao brandDao;

    @Override
    public List<Brand> selectAll() {
        return brandDao.selectAll();
    }

    @Override
    public Brand selectById(Integer id) {
        return brandDao.selectById(id);
    }
}
