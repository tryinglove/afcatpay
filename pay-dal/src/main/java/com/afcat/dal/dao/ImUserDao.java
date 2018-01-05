package com.afcat.dal.dao;

import com.afcat.common.vo.ImUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by john on 2017/12/6.
 */
public interface ImUserDao {
    void add(ImUser imUser);

    void delete(@Param("id_user") String id_user);

    List<ImUser>  list();

    int update(ImUser imUser);

    ImUser load(String id_user);

    ImUser login(@Param("account") String account,@Param("password") String password);

    List<ImUser>  validateAccount(@Param("account") String account);

}
