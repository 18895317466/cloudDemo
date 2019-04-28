package com.cloud.manger;

import com.cloud.dao.UserInfoMapper;
import com.cloud.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by ouyang on 2019/4/26.
 */
@Component
public class UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public List<UserInfo> list(){
        return userInfoMapper.find();
    }

}
