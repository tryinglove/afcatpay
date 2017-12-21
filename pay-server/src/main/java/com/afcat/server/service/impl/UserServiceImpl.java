package com.afcat.server.service.impl;


import com.afcat.common.service.UserService;
import com.afcat.common.vo.User;
import com.afcat.dal.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by john on 2017/12/6.
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {



    @Autowired
    private UserDao userDao;

    public void addUser(User user) {

        userDao.addUser(user);

    }

    public void deleteUser(int userId) {
        User user = userDao.getUserById(userId);
        if(null != user){
            userDao.deleteUser(userId);
        }

    }

    public User queryById(int userId) {
        User user = userDao.getUserById(userId);
        return user;
    }

    public List<User> queryUsers() {
        return userDao.getAllUser();
    }


    public User login(User User) {
        User user = userDao.login(User);
        return user;
    }

    public List<User> validateAccount(String account) {
        return userDao.validateAccount(account);
    }

    public void updateUser(User user) {
        if(null == userDao.getUserById(user.getUserId())){
            return;
        }
        userDao.updateUser(user);
    }

}
