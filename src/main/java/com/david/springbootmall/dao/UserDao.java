package com.david.springbootmall.dao;

import com.david.springbootmall.dto.UserRegisterRequest;
import com.david.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);
    Integer createUser(UserRegisterRequest userRegisterRequest);

}
