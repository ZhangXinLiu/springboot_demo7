package com.lxz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author liuxinzhang
 * @create 2019/3/6 - 17:50
 */

@SpringBootApplication
@MapperScan("com.lxz.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
