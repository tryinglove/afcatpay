package com.afcat.dal.dao;

import com.afcat.common.vo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by john on 2017/12/6.
 */
public interface UserDao {
    void addUser(User user);

    void deleteUser(@Param("userId") int userId);

    List<User>  getAllUser();

    void updateUser(User User);

    User getUserById(@Param("userId") int userId);

    User login(User User);

    List<User>  validateAccount(@Param("account") String account);

}
