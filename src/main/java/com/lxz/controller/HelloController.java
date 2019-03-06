package com.lxz.controller;

import com.lxz.pojo.User;
import com.lxz.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuxinzhang
 * @create 2019/3/6 - 18:12
 */
@RestController
@Slf4j
@RequestMapping("user")
public class HelloController {

    @Autowired
    private UserService userService;
    @GetMapping("{id}")
    public User hello(@PathVariable("id") Integer id) {
        return userService.queryById(id);
    }
}
