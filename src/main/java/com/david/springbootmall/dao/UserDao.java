package com.david.springbootmall.dao;

import com.david.springbootmall.dto.UserRegisterRequest;
import com.david.springbootmall.model.User;
import org.springframework.stereotype.Component;


public interface UserDao {
    User getUserById(Integer userId);

    User getUserByEmail(String email);
    Integer createUser(UserRegisterRequest userRegisterRequest);

}
