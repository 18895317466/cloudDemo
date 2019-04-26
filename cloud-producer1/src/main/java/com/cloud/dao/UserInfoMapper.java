package com.cloud.dao;

import com.cloud.entity.UserInfo;

import java.util.List;

public interface UserInfoMapper {


    int insert(UserInfo record);

    List<UserInfo> find();

    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo record);


}