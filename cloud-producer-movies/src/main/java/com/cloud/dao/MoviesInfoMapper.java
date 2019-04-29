package com.cloud.dao;

import com.cloud.entity.MoviesInfo;

import java.util.List;

public interface MoviesInfoMapper {

    int insert(MoviesInfo record);

    MoviesInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MoviesInfo record);

    List<MoviesInfo> list();


}