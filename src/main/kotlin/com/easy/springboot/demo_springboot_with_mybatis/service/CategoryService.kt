package com.easy.springboot.demo_springboot_with_mybatis.service

import com.easy.springboot.demo_springboot_with_mybatis.model.Category
import com.github.pagehelper.PageInfo

interface CategoryService {
    fun page(pageNo: Int, pageSize: Int): PageInfo<Category>
}