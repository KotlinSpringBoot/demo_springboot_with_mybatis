package com.easy.springboot.demo_springboot_with_mybatis.dao;

import com.easy.springboot.demo_springboot_with_mybatis.model.Category;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);

    @Select("SELECT * FROM category")
    List<Category> findAll();
}