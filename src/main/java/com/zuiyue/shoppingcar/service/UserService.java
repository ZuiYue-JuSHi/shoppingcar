package com.zuiyue.shoppingcar.service;

import com.zuiyue.shoppingcar.pojo.User;

import java.util.List;

/**
 * @author ：ZuiYue
 * @date ：Created in 2020/5/12 14:14
 * @description：user service api
 * @package: com.zuiyue.shoppingcar.service
 */
public interface UserService {
    /**
     * save
     * @param user user
     */
    void save(User user);

    /**
     * select By ID
     * @param id ID
     * @return user
     */
    User selectById(Integer id);


    /**
     * user all
     * @return user list
     */
    List<User> selectAll();
    /**
     * find user
     * @param phone phone
     * @return user
     */
    User selectByPhone(String phone);
}
