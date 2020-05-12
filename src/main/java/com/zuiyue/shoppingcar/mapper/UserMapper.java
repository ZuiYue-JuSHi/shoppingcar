package com.zuiyue.shoppingcar.mapper;

import com.zuiyue.shoppingcar.pojo.User;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author ：ZuiYue
 * @date ：Created in 2020/5/12 14:10
 * @description：user mapper
 * @package: com.zuiyue.shoppingcar.mapper
 */
@Repository
@Mapper
public interface UserMapper{
    /**
     * find user
     * @param phone phone
     * @return user
     */
    @Select("select * from user where phone = #{phone}")
    User findByPhone(@Param("phone") String phone);

    @Update("update user set last_time = #{lastTime},password =#{password},phone = #{phone},user_name = #{userName} where id =#{id}")
    void save(User user);
    @Insert("insert into user (last_time,password,phone,user_name) values (#{lastTime},#{password},#{phone},#{userName})")
    Integer insert(User user);
    @Select("select * from user where id = #{id}")
    User findById(Integer id);
    @Select("select * from user")
    List<User> findAll();
}
