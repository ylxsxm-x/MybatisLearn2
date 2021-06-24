package com.dj.mybatis.domain;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class User {
    private Integer id; // 主键id
    private String username; // 用户名称
    private Date birthday; // 生日
    private String sex; // 性别
    private String address; // 地址

    public User(Integer id, String username, Date birthday, String sex, String address) {
        this.id = id;
        this.username = username;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
    }

    public User() {
    }



    @Override
    public String toString() {
        return "User [id:" + id + ", 姓名：" + username + ", 生日：" + birthday + ", 性别：" + sex + ", 地址："
                + address + "]";
    }
}

