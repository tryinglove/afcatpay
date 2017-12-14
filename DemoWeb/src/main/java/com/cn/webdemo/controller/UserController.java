package com.cn.webdemo.controller;


import com.cn.common.service.DUserService;
import com.cn.common.vo.DUser;
import com.cn.webdemo.common.NoSessionController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by john on 2017/12/7.
 *
 */
@Controller
@RequestMapping("user")
public class UserController extends NoSessionController {

    @Resource(name = "userService")
    DUserService userService;

    @RequestMapping("/show")
    @ResponseBody
    public ModelAndView showUsers(){
        ModelAndView mv = new ModelAndView();

        List<DUser> userList = userService.queryUsers();

        mv.addObject("userList",userList);
        mv.setViewName("user/showUser");
        return mv;
    }

    @RequestMapping("/delete/{userId}")
    public String deleteUser(@PathVariable("userId") int userId){
        userService.deleteUser(userId);

        return "redirect:/user/show";
    }

    @RequestMapping("/update")
    public String updateUser(DUser user){

        userService.updateUser(user);

        return "redirect:/user/show";
    }
    @RequestMapping("/toUpdate/{userId}")
    public String updateUser(@PathVariable("userId") int userId){
        DUser user = userService.queryById(userId);
        this.request.setAttribute("user",user);

        return "user/updateUser";
    }
    @RequestMapping("/add")
    public String addUser(DUser user){
        userService.addUser(user);
        return  "redirect:/user/show";
    }

    @RequestMapping("/toAdd")
    public String addUser(){
        return "user/addUser";
    }

    @RequestMapping("/query")
    public ModelAndView queryUserById(int userId){
        ModelAndView mv = new ModelAndView();
        DUser user = userService.queryById(userId);
        mv.addObject("user",user);
        mv.setViewName("user/showUserById");
        return mv;
    }

}
