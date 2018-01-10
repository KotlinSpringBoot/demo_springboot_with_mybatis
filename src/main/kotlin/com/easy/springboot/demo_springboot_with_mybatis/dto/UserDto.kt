package com.easy.springboot.demo_springboot_with_mybatis.dto

import com.easy.springboot.demo_springboot_with_mybatis.model.Role
import com.easy.springboot.demo_springboot_with_mybatis.model.User

class UserDto: User() {
    lateinit var roles: List<Role>
}