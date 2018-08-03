package com.easy.springboot.demo_springboot_with_mybatis.dao;

import com.easy.springboot.demo_springboot_with_mybatis.model.UserRolesKey;

public interface UserRolesMapper {
    int deleteByPrimaryKey(UserRolesKey key);

    int insert(UserRolesKey record);

    int insertSelective(UserRolesKey record);
}