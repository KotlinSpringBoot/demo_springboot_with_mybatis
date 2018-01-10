package com.easy.springboot.demo_springboot_with_mybatis.model;

public class UserRolesKey {
    private Long userId;

    private Long rolesId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRolesId() {
        return rolesId;
    }

    public void setRolesId(Long rolesId) {
        this.rolesId = rolesId;
    }
}