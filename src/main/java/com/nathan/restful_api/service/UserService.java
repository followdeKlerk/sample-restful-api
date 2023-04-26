package com.nathan.restful_api.service;

import com.nathan.restful_api.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    User createUser (User user);

    User getUserById (Long userId);

    List<User> getAllUsers();

    User updateUser (User user);

    void deleteUser (Long userId);
}
