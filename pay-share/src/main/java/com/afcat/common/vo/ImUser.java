package com.afcat.common.vo;


import java.io.Serializable;

public class ImUser implements Serializable {

    /**用户登录的id编号,整张数据表的主键,所属表字段为 im_user.id_user  */
    private String idUser;
    /**登录系统的用户名,所属表字段为 im_user.user_name  */
    private String userName;
    private String userAcc;
    /**用户的电话,所属表字段为 im_user.user_phone  */
    private String userPhone;
    /**用户的email邮箱地址,所属表字段为 im_user.user_email  */
    private String userEmail;
    /**用户的证件类型: 1.身份证,所属表字段为 im_user.user_certype  */
    private String userCertype;
    /**用户的证件号码：用户的身份证号,所属表字段为 im_user.user_certno  */
    private String userCertno;
    /**用户的登录密码,所属表字段为 im_user.user_pwd  */
    private String userPwd;
    /**0:强制要求修改 1:未强制要求修改,所属表字段为 im_user.user_initpwd  */
    private String userInitpwd;
    /**0:正常, 2:暂时冻结, 3:用户停用, 4:永久冻结,所属表字段为 im_user.user_stt  */
    private String userStt;
    /**用户信息描述,所属表字段为 im_user.user_desc  */
    private String userDesc;
    /**预留字段1,所属表字段为 im_user.user_remark1  */
    private String userRemark1;
    /**预留字段2,所属表字段为 im_user.user_remark2  */
    private String userRemark2;
    /**预留字段3,所属表字段为 im_user.user_remark3  */
    private String userRemark3;

    /**
     * 获取 用户登录的id编号,整张数据表的主键 字段:im_user.id_user
     *
     * @return  im_user.id_user  ,用户登录的id编号,整张数据表的主键
     */
    public String getIdUser() {
        return idUser;
    }

    /**
     * 设置 用户登录的id编号,整张数据表的主键 字段:im_user.id_user
     *
     * @param idUser  im_user.id_user,用户登录的id编号,整张数据表的主键
     */
    public void setIdUser(String idUser) {
        this.idUser = idUser == null ? null : idUser.trim();
    }

    /**
     * 获取 登录系统的用户名 字段:im_user.user_name
     *
     * @return  im_user.user_name  ,登录系统的用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置 登录系统的用户名 字段:im_user.user_name
     *
     * @param userName  im_user.user_name,登录系统的用户名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取  字段:im_user.user_acc
     *
     * @return  im_user.user_acc
     */
    public String getUserAcc() {
        return userAcc;
    }

    /**
     * 设置  字段:im_user.user_acc
     *
     * @param userAcc  im_user.user_acc
     */
    public void setUserAcc(String userAcc) {
        this.userAcc = userAcc == null ? null : userAcc.trim();
    }

    /**
     * 获取 用户的电话 字段:im_user.user_phone
     *
     * @return  im_user.user_phone  ,用户的电话
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 设置 用户的电话 字段:im_user.user_phone
     *
     * @param userPhone  im_user.user_phone,用户的电话
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * 获取 用户的email邮箱地址 字段:im_user.user_email
     *
     * @return  im_user.user_email  ,用户的email邮箱地址
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 设置 用户的email邮箱地址 字段:im_user.user_email
     *
     * @param userEmail  im_user.user_email,用户的email邮箱地址
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * 获取 用户的证件类型: 1.身份证 字段:im_user.user_certype
     *
     * @return  im_user.user_certype  ,用户的证件类型: 1.身份证
     */
    public String getUserCertype() {
        return userCertype;
    }

    /**
     * 设置 用户的证件类型: 1.身份证 字段:im_user.user_certype
     *
     * @param userCertype  im_user.user_certype,用户的证件类型: 1.身份证
     */
    public void setUserCertype(String userCertype) {
        this.userCertype = userCertype == null ? null : userCertype.trim();
    }

    /**
     * 获取 用户的证件号码：用户的身份证号 字段:im_user.user_certno
     *
     * @return  im_user.user_certno  ,用户的证件号码：用户的身份证号
     */
    public String getUserCertno() {
        return userCertno;
    }

    /**
     * 设置 用户的证件号码：用户的身份证号 字段:im_user.user_certno
     *
     * @param userCertno  im_user.user_certno,用户的证件号码：用户的身份证号
     */
    public void setUserCertno(String userCertno) {
        this.userCertno = userCertno == null ? null : userCertno.trim();
    }

    /**
     * 获取 用户的登录密码 字段:im_user.user_pwd
     *
     * @return  im_user.user_pwd  ,用户的登录密码
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * 设置 用户的登录密码 字段:im_user.user_pwd
     *
     * @param userPwd  im_user.user_pwd,用户的登录密码
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    /**
     * 获取 0:强制要求修改 1:未强制要求修改 字段:im_user.user_initpwd
     *
     * @return  im_user.user_initpwd  ,0:强制要求修改 1:未强制要求修改
     */
    public String getUserInitpwd() {
        return userInitpwd;
    }

    /**
     * 设置 0:强制要求修改 1:未强制要求修改 字段:im_user.user_initpwd
     *
     * @param userInitpwd  im_user.user_initpwd,0:强制要求修改 1:未强制要求修改
     */
    public void setUserInitpwd(String userInitpwd) {
        this.userInitpwd = userInitpwd == null ? null : userInitpwd.trim();
    }

    /**
     * 获取 0:正常, 2:暂时冻结, 3:用户停用, 4:永久冻结 字段:im_user.user_stt
     *
     * @return  im_user.user_stt  ,0:正常, 2:暂时冻结, 3:用户停用, 4:永久冻结
     */
    public String getUserStt() {
        return userStt;
    }

    /**
     * 设置 0:正常, 2:暂时冻结, 3:用户停用, 4:永久冻结 字段:im_user.user_stt
     *
     * @param userStt  im_user.user_stt,0:正常, 2:暂时冻结, 3:用户停用, 4:永久冻结
     */
    public void setUserStt(String userStt) {
        this.userStt = userStt == null ? null : userStt.trim();
    }

    /**
     * 获取 用户信息描述 字段:im_user.user_desc
     *
     * @return  im_user.user_desc  ,用户信息描述
     */
    public String getUserDesc() {
        return userDesc;
    }

    /**
     * 设置 用户信息描述 字段:im_user.user_desc
     *
     * @param userDesc  im_user.user_desc,用户信息描述
     */
    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc == null ? null : userDesc.trim();
    }

    /**
     * 获取 预留字段1 字段:im_user.user_remark1
     *
     * @return  im_user.user_remark1  ,预留字段1
     */
    public String getUserRemark1() {
        return userRemark1;
    }

    /**
     * 设置 预留字段1 字段:im_user.user_remark1
     *
     * @param userRemark1  im_user.user_remark1,预留字段1
     */
    public void setUserRemark1(String userRemark1) {
        this.userRemark1 = userRemark1 == null ? null : userRemark1.trim();
    }

    /**
     * 获取 预留字段2 字段:im_user.user_remark2
     *
     * @return  im_user.user_remark2  ,预留字段2
     */
    public String getUserRemark2() {
        return userRemark2;
    }

    /**
     * 设置 预留字段2 字段:im_user.user_remark2
     *
     * @param userRemark2  im_user.user_remark2,预留字段2
     */
    public void setUserRemark2(String userRemark2) {
        this.userRemark2 = userRemark2 == null ? null : userRemark2.trim();
    }

    /**
     * 获取 预留字段3 字段:im_user.user_remark3
     *
     * @return  im_user.user_remark3  ,预留字段3
     */
    public String getUserRemark3() {
        return userRemark3;
    }

    /**
     * 设置 预留字段3 字段:im_user.user_remark3
     *
     * @param userRemark3  im_user.user_remark3,预留字段3
     */
    public void setUserRemark3(String userRemark3) {
        this.userRemark3 = userRemark3 == null ? null : userRemark3.trim();
    }
}