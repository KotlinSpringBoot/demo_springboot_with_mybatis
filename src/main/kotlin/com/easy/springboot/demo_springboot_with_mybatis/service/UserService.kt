package com.easy.springboot.demo_springboot_with_mybatis.service

import com.easy.springboot.demo_springboot_with_mybatis.dto.UserDto
import com.easy.springboot.demo_springboot_with_mybatis.model.User

interface UserService {
    fun findAll(): List<User>
    fun listUserDto(): List<UserDto>
}