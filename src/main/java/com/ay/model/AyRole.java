package com.ay.model;

import java.io.Serializable;
import java.util.List;

/**
 * 角色实体
 */
public class AyRole implements Serializable {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AyUser> getUserList() {
        return userList;
    }

    public void setUserList(List<AyUser> userList) {
        this.userList = userList;
    }

    // 角色和用户是多对多的关系,一个角色对应多个用户
    private List<AyUser> userList;
}
