package com.zuiyue.shoppingcar.service.impl;

import com.zuiyue.shoppingcar.mapper.UserMapper;
import com.zuiyue.shoppingcar.pojo.User;
import com.zuiyue.shoppingcar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author ：ZuiYue
 * @date ：Created in 2020/5/12 14:18
 * @description：
 * @package: com.zuiyue.shoppingcar.service.impl
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void save(User user) {
        if (user.getId() != null) {
            userMapper.save(user);
        }else {
            userMapper.insert(user);
        }
    }

    @Override
    public User selectById(Integer id) {
        return userMapper.findById(id);

    }


    @Override
    public List<User> selectAll() {
        return userMapper.findAll();
    }

    @Override
    public User selectByPhone(String phone) {
        return userMapper.findByPhone(phone);
    }
}
