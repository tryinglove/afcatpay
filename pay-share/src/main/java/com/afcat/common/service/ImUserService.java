package com.afcat.common.service;

import com.afcat.common.vo.ImUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by john on 2017/12/6.
 */
public interface ImUserService {
    void add(ImUser imUser);

    void delete(String userId);

    List<ImUser>  list();

    int update(ImUser imUser);

    ImUser load(String id_user);

    ImUser login(String account,String password);

    List<ImUser>  validateAccount(String account);
}
