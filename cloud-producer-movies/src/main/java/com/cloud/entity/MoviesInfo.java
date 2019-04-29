package com.cloud.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class MoviesInfo {
    private Integer id;

    private String name;
    @JSONField(format = "yyyy-MM-dd")
    private Date releasedate;

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
        this.name = name == null ? null : name.trim();
    }

    public Date getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }
}