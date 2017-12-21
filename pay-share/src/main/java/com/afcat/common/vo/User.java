package com.afcat.common.vo;

import java.io.Serializable;

/**
 * Created by john on 2017/12/6.
 */
public class User implements Serializable{
    private int userId;
    private String account;
    private String password;
    private String userName;
    private String userRemark;


    public int getUserId() {
        return userId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserRemark() {
        return userRemark;
    }

    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark;
    }

}
