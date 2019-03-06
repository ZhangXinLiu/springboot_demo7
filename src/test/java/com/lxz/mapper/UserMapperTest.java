package com.lxz.mapper;

import com.lxz.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author liuxinzhang
 * @create 2019/3/6 - 21:02
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testQuery() {
        User user = userMapper.selectByPrimaryKey(46);
        System.out.println("user"+user);
    }

}