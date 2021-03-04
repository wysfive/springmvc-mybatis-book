package com.ay.model;

import java.io.Serializable;

/**
 * 用户实体
 */
public class AyUser implements Serializable {
    private Integer id;
    private String name;
    private String password;
    private Integer age;
    // 用户和地址一一对应，及一个用户就只有一个地址
    private AyUserAddress ayUserAddress;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public AyUserAddress getAyUserAddress() {
        return ayUserAddress;
    }

    public void setAyUserAddress(AyUserAddress ayUserAddress) {
        this.ayUserAddress = ayUserAddress;
    }

    @Override
    public String toString() {
        return "AyUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", ayUserAddress=" + ayUserAddress +
                '}';
    }
}
