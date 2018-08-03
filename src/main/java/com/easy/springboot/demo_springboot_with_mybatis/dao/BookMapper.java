package com.easy.springboot.demo_springboot_with_mybatis.dao;

import com.easy.springboot.demo_springboot_with_mybatis.model.Book;

public interface BookMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
}