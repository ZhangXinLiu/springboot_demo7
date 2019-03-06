package com.lxz.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author liuxinzhang
 * @create 2019/3/6 - 19:51
 */
@Data
@Table(name = "tab_user")
public class User {
    @Id
    @KeySql(useGeneratedKeys = true )
    private Integer uid;
    private String username;
    private String password;
    private String name;
    private Date birthday;
    private Character sex;
    private String telephone;
    private String email;
    private Character status;
    private String code;


}
