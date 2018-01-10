package com.easy.springboot.demo_springboot_with_mybatis.dao;

import com.easy.springboot.demo_springboot_with_mybatis.model.Article;

public interface ArticleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);
}