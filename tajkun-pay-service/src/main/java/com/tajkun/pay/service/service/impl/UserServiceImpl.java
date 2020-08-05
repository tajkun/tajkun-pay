package com.tajkun.pay.service.service.impl;

import com.tajkun.pay.service.entity.User;
import com.tajkun.pay.service.mapper.UserMapper;
import com.tajkun.pay.service.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @program: tajkun-pay
 * @description:
 * @author: Jiakun
 * @create: 2020-08-05 16:30
 **/
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int createUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public int deleteUser(String id) {
        return 0;
    }

    @Override
    public User getUserById(String id) {
        return null;
    }

    @Override
    public User getUserByMobile(String mobile) {
        return null;
    }

    @Override
    public User getUserByNo(String userNo) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}