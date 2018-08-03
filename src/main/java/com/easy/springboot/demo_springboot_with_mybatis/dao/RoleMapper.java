package com.easy.springboot.demo_springboot_with_mybatis.dao;

import com.easy.springboot.demo_springboot_with_mybatis.model.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    @Select("SELECT r.* FROM role r \n" +
            "JOIN user_roles ur ON r.id = ur.roles_id\n" +
            "JOIN user u ON u.id = ur.user_id\n" +
            "WHERE u.id=#{userId}")
    List<Role> listByUserId(Long userId);

}