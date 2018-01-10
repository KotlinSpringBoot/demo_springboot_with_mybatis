package com.easy.springboot.demo_springboot_with_mybatis.controller

import com.easy.springboot.demo_springboot_with_mybatis.dto.UserDto
import com.easy.springboot.demo_springboot_with_mybatis.model.User
import com.easy.springboot.demo_springboot_with_mybatis.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController {
    @Autowired lateinit var userService: UserService

    @GetMapping("/findAll")
    fun findAll(): List<User> {
        return userService.findAll()
    }

    @GetMapping("/listUserDto")
    fun listUserDto(): List<UserDto> {
        return userService.listUserDto()
    }

}