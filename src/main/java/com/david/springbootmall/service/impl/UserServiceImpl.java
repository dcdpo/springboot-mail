package com.david.springbootmall.service.impl;

import com.david.springbootmall.dao.UserDao;
import com.david.springbootmall.dto.UserRegisterRequest;
import com.david.springbootmall.model.User;
import com.david.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
