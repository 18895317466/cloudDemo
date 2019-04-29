package com.cloud.manger;

import com.cloud.dao.MoviesInfoMapper;
import com.cloud.entity.MoviesInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by ouyang on 2019/4/29.
 */
@Component
public class MoversManager {

    @Autowired
    private MoviesInfoMapper moviesInfoMapper;

    public List<MoviesInfo> list(){
        return moviesInfoMapper.list();
    }
}
