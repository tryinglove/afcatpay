package com.test.serviceTest;


import com.afcat.common.service.DUserService;
import com.afcat.common.vo.DUser;
import com.test.SpringServiceJunitTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by john on 2017/12/7.
 */
public class ServiceJunitTest extends SpringServiceJunitTest{
    @Autowired
    DUserService userService;

    @Test
    public void addUser(){
        DUser user = new DUser();

        user.setUserId(55523);
        user.setUserName("小蓝");
        user.setUserRemark("redis add service测试.....");

        userService.addUser(user);
    }

    @Test
    public void deleteUser(){
        userService.deleteUser(55523);
    }

    @Test
    public void updateUser(){
        DUser user = new DUser();

        user.setUserId(55523);
        user.setUserName("bushiwo");
        user.setUserRemark("update redis service修改测试............");

        userService.updateUser(user);
    }
    @Test
    public void queryUsers(){
        List<DUser>  userList = userService.queryUsers();

        for (DUser user:userList){
            System.out.println(user.getUserName());
        }
    }
    @Test
    public void queryUser(){
        DUser user = userService.queryById(89895585);

        System.out.println(user.getUserName());
    }
}
