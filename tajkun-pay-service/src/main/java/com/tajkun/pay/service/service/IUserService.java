package com.tajkun.pay.service.service;

import com.tajkun.pay.service.entity.User;

import java.util.List;

/**
 * @program: tajkun-pay
 * @description:
 * @author: Jiakun
 * @create: 2020-08-05 16:17
 **/
public interface IUserService {

    int createUser(User user);

    int updateUser(User user);

    int deleteUser(String id);

    User getUserById(String id);
    User getUserByMobile(String mobile);
    User getUserByNo(String userNo);

    List<User> getAllUsers();

}