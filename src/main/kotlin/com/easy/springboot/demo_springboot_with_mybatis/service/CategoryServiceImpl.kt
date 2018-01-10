package com.easy.springboot.demo_springboot_with_mybatis.service

import com.easy.springboot.demo_springboot_with_mybatis.dao.CategoryMapper
import com.easy.springboot.demo_springboot_with_mybatis.model.Category
import com.github.pagehelper.PageHelper
import com.github.pagehelper.PageInfo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CategoryServiceImpl : CategoryService {
    @Autowired lateinit var categoryMapper: CategoryMapper

    override fun page(pageNo: Int, pageSize: Int): PageInfo<Category> {
        PageHelper.startPage<Category>(pageNo, pageSize)
        val list = categoryMapper.findAll()
        return PageInfo(list)
    }

}