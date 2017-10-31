package com.hi;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/9/2.
 */
@Mapper
public interface UserMapper{
    @Select("select * from user_s where user_name = #{name}")
    public ArrayList<User> findUserByName(@Param("name")String name);
    @Select({"select * from user_s where id = #{name}"})
    public User findUserById(Long id);
    @Insert("insert into user_s(user_name) values(#{user.user_name})")
    @SelectKey(statement = "select last_insert_id()", keyProperty = "user.id", before = false, resultType = Long.class)
    public Long save(@Param("user")User user);
}
