package com.afcat.dal.dao;


import com.afcat.common.vo.DUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by john on 2017/12/6.
 */
public interface DUserDao {
    void addUser(DUser dUser);

    void deleteUser(@Param("userId") int userId);

    List<DUser>  getAllUser();

    void updateUser(DUser dUser);

    DUser getUserById(@Param("userId") int userId);
}
