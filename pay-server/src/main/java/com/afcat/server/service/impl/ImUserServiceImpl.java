package com.afcat.server.service.impl;


import com.afcat.common.service.ImUserService;
import com.afcat.common.vo.ImUser;
import com.afcat.dal.dao.ImUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by john on 2017/12/6.
 *
 */
@Service("imUserService")
public class ImUserServiceImpl implements ImUserService {



    @Autowired
    private ImUserDao imImUserDao;

    public void add(ImUser imUser) {

        imImUserDao.add(imUser);

    }

    public void delete(String userId) {
        ImUser imUser = imImUserDao.load(userId);
        if(null != imUser){
            imImUserDao.delete(userId);
        }

    }

    public ImUser load(String userId) {
        ImUser imUser = imImUserDao.load(userId);
        return imUser;
    }

    public List<ImUser> list() {
        return imImUserDao.list();
    }


    public ImUser login(String account,String password) {
        return imImUserDao.login(account,password);
    }

    public List<ImUser> validateAccount(String account) {
        return imImUserDao.validateAccount(account);
    }

    public int update(ImUser imUser) {
        if(null != imImUserDao.load(imUser.getId_user())){
            return imImUserDao.update(imUser);
        }else{
            return 0;
        }

    }

}
