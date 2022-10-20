package com.david.springbootmall.service;

import com.david.springbootmall.dto.UserLoginRequest;
import com.david.springbootmall.dto.UserRegisterRequest;
import com.david.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);
    User login(UserLoginRequest userLoginRequest);

}
