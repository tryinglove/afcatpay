package com.afcat.webdemo.common;


import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

    /**
     * Created by john on 2017/11/11.
     */

public abstract class BaseController {

    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected HttpSession session;
    protected ServletContext application;

    @ModelAttribute
    public void setServletAPI(HttpServletRequest request, HttpServletResponse response) {

        this.request = request;
        this.response = response;
        this.session = request.getSession();
        this.application = this.session.getServletContext();
    }
}


