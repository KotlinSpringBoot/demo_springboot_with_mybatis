package com.easy.springboot.demo_springboot_with_mybatis.controller

import com.easy.springboot.demo_springboot_with_mybatis.model.Category
import com.easy.springboot.demo_springboot_with_mybatis.service.CategoryService
import com.github.pagehelper.PageInfo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/category")
class CategoryController {
    @Autowired lateinit var categoryService: CategoryService

    @GetMapping("/page")
    fun page(@RequestParam(value = "pageNo", defaultValue = "0") pageNo: Int,
             @RequestParam(value = "pageSize", defaultValue = "10") pageSize: Int): PageInfo<Category> {
        return categoryService.page(pageNo, pageSize)
    }

}