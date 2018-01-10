package com.easy.springboot.demo_springboot_with_mybatis.service

import com.easy.springboot.demo_springboot_with_mybatis.dao.UserMapper
import com.easy.springboot.demo_springboot_with_mybatis.dto.UserDto
import com.easy.springboot.demo_springboot_with_mybatis.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService {

    @Autowired lateinit var userMapper: UserMapper
    override fun findAll(): List<User> {
        return userMapper.findAll()
    }

    override fun listUserDto(): List<UserDto> {
        return userMapper.listUserDto()
    }

}