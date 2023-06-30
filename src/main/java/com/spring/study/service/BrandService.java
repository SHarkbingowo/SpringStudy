package com.spring.study.service;

import com.spring.study.domain.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> selectAll();

    Brand selectById(Integer id);
}
