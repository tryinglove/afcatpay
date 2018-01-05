package com.afcat.webdemo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.afcat.common.service.ImUserService;
import com.afcat.common.util.IDUtil;
import com.afcat.common.vo.ImUser;
import com.afcat.webdemo.common.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@Scope("prototype")
@RequestMapping("/imUser")
public class ImUserController extends BaseController {

    private final static String URL_USER_LIST = "/list";
    private final static String JSP_USER_LIST = "imUser/list";
    private final static String URL_USER_ADD = "/add";
    private final static String JSP_USER_ADD = "imUser/add";
    private final static String URL_USER_DELETE = "/delete/{id_user}";
    private final static String URL_USER_CHANGEPASSWORD = "/changePassword";
    private final static String JSP_USER_CHANGEPASSWORD = "imUser/changePassword";
    private final static String URL_USER_TOUPDATE = "/update/{id_user}";
    private final static String JSP_USER_TOUPDATE = "imUser/update";
    private final static String URL_USER_UPDATE = "/update";

    private final static String URL_USER_SELECTLIST = "/selectList";
    private final static String JSP_USER_SELECTLIST = "imUser/selectList";

    @Autowired
    private ImUserService imUserService;

    @GetMapping(URL_USER_SELECTLIST)
    public String selectList(Model model){
        model.addAttribute("imUserList" , this.imUserService.list());
        return JSP_USER_SELECTLIST;
    }

    @GetMapping(URL_USER_TOUPDATE)
    public String update(@PathVariable("id_user") String id_user,Model model){
        model.addAttribute("imUser" , this.imUserService.load(id_user));
        return JSP_USER_TOUPDATE;
    }

    @PostMapping(URL_USER_UPDATE)
    @ResponseBody
    public String update(ImUser imUser){
        this.imUserService.update(imUser);
        return "success";
    }

    @GetMapping(URL_USER_CHANGEPASSWORD)
    public String changePassword(){
        return JSP_USER_CHANGEPASSWORD;
    }

    @PostMapping(URL_USER_CHANGEPASSWORD)
    @ResponseBody
    public String changePassword(ImUser imUser){
        this.imUserService.update(imUser);

        ImUser newImUser = (ImUser)this.session.getAttribute("session_imUser");
        newImUser.setUserPwd(imUser.getUserPwd());
        session.setAttribute("session_imUser" , newImUser);

        return "success";
    }

    @GetMapping(URL_USER_ADD)
    public String add(){
        return JSP_USER_ADD;
    }

    @PostMapping(URL_USER_ADD)
    @ResponseBody
    public String add(ImUser imUser){
        imUser.setIdUser(IDUtil.getId());
        this.imUserService.add(imUser);
        return "success";
    }


    @GetMapping(URL_USER_LIST)
    public String list(Model model){
        List<ImUser> imUserList= this.imUserService.list();
        model.addAttribute("imUserList" ,imUserList);
        return JSP_USER_LIST;
    }

    @GetMapping(URL_USER_DELETE)
    public String delete(@PathVariable("id_user") String id_user,Model model){
        this.imUserService.delete(id_user);
        return list(model);
    }

}
