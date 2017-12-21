package com.afcat.common.service;

import com.afcat.common.vo.User;

import java.util.List;

/**
 * Created by john on 2017/12/6.
 */
public interface UserService {
    void addUser(User user);

    void deleteUser(int userId);

    User queryById(int userId);

    List<User> queryUsers();

    void updateUser(User user);

    User login(User User);

    List<User>  validateAccount(String account);

}
