package com.easy.springboot.demo_springboot_with_mybatis

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@MapperScan("com.easy.springboot.demo_springboot_with_mybatis.dao")
class DemoSpringbootWithMybatisApplication

fun main(args: Array<String>) {
    runApplication<DemoSpringbootWithMybatisApplication>(*args)
}
