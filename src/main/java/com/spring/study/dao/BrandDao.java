package com.spring.study.dao;

import com.spring.study.domain.Brand;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandDao {

    @Select("SELECT * from tb_brand")
    List<Brand> selectAll();

    @Select("SELECT * from tb_brand where id = #{id}")
    Brand selectById(Integer id);

}
