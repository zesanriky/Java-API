package com.rahman.app.service;

import java.util.List;

import com.rahman.app.entity.User;

/**
 * A interface to define all required methods for user Object.
 * @author Rahman
 */
public interface UserService {

    User saveUser(User user);

    User findUserById(Long userId);

    List<User> findAllUsers();

    User updateUser(User user);

    void deleteUser(Long userId);
}
