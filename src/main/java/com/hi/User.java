package com.hi;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by wan on 2017/1/17.
 */
public class User {

    @TableName("ID")
    private Long id;
    @TableName("用户名")
    private String user_name;
    @TableName("生日")
    private Date birth_day;
    @TableName("性别")
    private String sex;
    @TableName("地址")
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Date getBirth_day() {
        return birth_day;
    }

    public void setBirth_day(Date birth_day) {
        this.birth_day = birth_day;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}