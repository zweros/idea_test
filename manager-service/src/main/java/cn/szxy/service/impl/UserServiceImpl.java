package cn.szxy.service.impl;

import cn.szxy.mapper.UserMapper;
import cn.szxy.pojo.Users;
import cn.szxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Auther:wzer
 * @Date:2019/5/28
 * @Description:cn.szxy.service.impl
 * @Version:1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(Users user) {
        this.userMapper.insertUser(user);
    }
}
