package com.cn.service.impl;

import com.cn.dao.DUserDao;
import com.cn.jedis.JedisTemplate;
import com.cn.service.DUserService;
import com.cn.vo.DUser;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * Created by john on 2017/12/6.
 *
 */
@Service("userService")
public class DUserServiceImpl implements DUserService {

    private static final Log logger = LogFactory.getLog(DUserServiceImpl.class);
    //jackson 用于对象与json转化
    ObjectMapper jsonMapper = new ObjectMapper();
    final static String ADDTOREDIS = "从redis中查出";
    @Autowired
    private DUserDao userDao;
    @Autowired
    private JedisTemplate jedisTemplate;

    public void addUser(DUser dUser) {

        userDao.addUser(dUser);

        logger.info("添加用户到redis,用户名："+dUser.getUserName());

        try {
            jedisTemplate.set(Integer.toString(dUser.getUserId()), jsonMapper.writeValueAsString(dUser));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void deleteUser(int userId) {
        DUser user = userDao.getUserById(userId);
        if(null != user){
            userDao.deleteUser(userId);
            logger.info("从redis删除用户,用户名："+user.getUserName());
            jedisTemplate.delete(user.getUserName());
        }

    }

    public DUser queryById(int userId) {
        DUser user = null;
        String value = jedisTemplate.get(Integer.toString(userId));
        if (null == value ||value.equals("")){
            user = userDao.getUserById(userId);
            try {
                jedisTemplate.set(Integer.toString(user.getUserId()),jsonMapper.writeValueAsString(user));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return user;
        }

        try {
            user = jsonMapper.readValue(value,DUser.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        user.setUserRemark(ADDTOREDIS+user.getUserRemark());
        logger.info("从缓存中查出用户："+user.getUserName());
        return user;

    }

    public List<DUser> queryUsers() {
        return userDao.getAllUser();
    }

    public void updateUser(DUser dUser) {
        if(null == userDao.getUserById(dUser.getUserId())){
            return;
        }
        userDao.updateUser(dUser);

        try {
            jedisTemplate.set(Integer.toString(dUser.getUserId()), jsonMapper.writeValueAsString(dUser));
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.info("更新缓存中的用户信息："+dUser.getUserName());
    }

}
