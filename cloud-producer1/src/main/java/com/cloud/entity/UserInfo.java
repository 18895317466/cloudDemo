package com.cloud.entity;

import java.math.BigDecimal;

public class UserInfo {
    private Integer id;

    private String username;

    private String name;

    private Integer age;

    private BigDecimal balane;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getBalane() {
        return balane;
    }

    public void setBalane(BigDecimal balane) {
        this.balane = balane;
    }
}