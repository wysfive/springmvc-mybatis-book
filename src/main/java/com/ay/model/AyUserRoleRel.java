package com.ay.model;

import java.io.Serializable;

/**
 * 用户角色关联实体
 */
public class AyUserRoleRel implements Serializable {
    private Integer id;
    // 用户id
    private Integer userid;
    // 角色id
    private Integer roleid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
}
