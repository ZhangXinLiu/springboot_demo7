package com.lxz.service;

import com.lxz.mapper.UserMapper;
import com.lxz.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liuxinzhang
 * @create 2019/3/6 - 21:24
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
