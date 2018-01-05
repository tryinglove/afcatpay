
package com.afcat.common.vo;

import java.io.Serializable;

public class ImUser  implements Serializable {

    /**用户登录的id编号,整张数据表的主键,所属表字段为 im_user.id_user  */
    private String id_user;
    /**登录系统的用户名,所属表字段为 im_user.user_name  */
    private String user_name;
    private String user_acc;
    /**用户的电话,所属表字段为 im_user.user_phone  */
    private String user_phone;
    /**用户的email邮箱地址,所属表字段为 im_user.user_email  */
    private String user_email;
    /**用户的证件类型: 1.身份证,所属表字段为 im_user.user_certype  */
    private String user_certype;
    /**用户的证件号码：用户的身份证号,所属表字段为 im_user.user_certno  */
    private String user_certno;
    /**用户的登录密码,所属表字段为 im_user.user_pwd  */
    private String user_pwd;
    /**0:强制要求修改 1:未强制要求修改,所属表字段为 im_user.user_initpwd  */
    private String user_initpwd;
    /**0:正常, 2:暂时冻结, 3:用户停用, 4:永久冻结,所属表字段为 im_user.user_stt  */
    private String user_stt;
    /**用户信息描述,所属表字段为 im_user.user_desc  */
    private String user_desc;
    /**预留字段1,所属表字段为 im_user.user_remark1  */
    private String user_remark1;
    /**预留字段2,所属表字段为 im_user.user_remark2  */
    private String user_remark2;
    /**预留字段3,所属表字段为 im_user.user_remark3  */
    private String user_remark3;

    /**
     * 获取 用户登录的id编号,整张数据表的主键 字段:im_user.id_user
     *
     * @return  im_user.id_user  ,用户登录的id编号,整张数据表的主键
     */
    public String getId_user() {
        return id_user;
    }

    /**
     * 设置 用户登录的id编号,整张数据表的主键 字段:im_user.id_user
     *
     * @param id_user  im_user.id_user,用户登录的id编号,整张数据表的主键
     */
    public void setId_user(String id_user) {
        this.id_user = id_user == null ? null : id_user.trim();
    }

    /**
     * 获取 登录系统的用户名 字段:im_user.user_name
     *
     * @return  im_user.user_name  ,登录系统的用户名
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * 设置 登录系统的用户名 字段:im_user.user_name
     *
     * @param user_name  im_user.user_name,登录系统的用户名
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    /**
     * 获取  字段:im_user.user_acc
     *
     * @return  im_user.user_acc
     */
    public String getUser_acc() {
        return user_acc;
    }

    /**
     * 设置  字段:im_user.user_acc
     *
     * @param user_acc  im_user.user_acc
     */
    public void setUser_acc(String user_acc) {
        this.user_acc = user_acc == null ? null : user_acc.trim();
    }

    /**
     * 获取 用户的电话 字段:im_user.user_phone
     *
     * @return  im_user.user_phone  ,用户的电话
     */
    public String getUser_phone() {
        return user_phone;
    }

    /**
     * 设置 用户的电话 字段:im_user.user_phone
     *
     * @param user_phone  im_user.user_phone,用户的电话
     */
    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone == null ? null : user_phone.trim();
    }

    /**
     * 获取 用户的email邮箱地址 字段:im_user.user_email
     *
     * @return  im_user.user_email  ,用户的email邮箱地址
     */
    public String getUser_email() {
        return user_email;
    }

    /**
     * 设置 用户的email邮箱地址 字段:im_user.user_email
     *
     * @param user_email  im_user.user_email,用户的email邮箱地址
     */
    public void setUser_email(String user_email) {
        this.user_email = user_email == null ? null : user_email.trim();
    }

    /**
     * 获取 用户的证件类型: 1.身份证 字段:im_user.user_certype
     *
     * @return  im_user.user_certype  ,用户的证件类型: 1.身份证
     */
    public String getUser_certype() {
        return user_certype;
    }

    /**
     * 设置 用户的证件类型: 1.身份证 字段:im_user.user_certype
     *
     * @param user_certype  im_user.user_certype,用户的证件类型: 1.身份证
     */
    public void setUser_certype(String user_certype) {
        this.user_certype = user_certype == null ? null : user_certype.trim();
    }

    /**
     * 获取 用户的证件号码：用户的身份证号 字段:im_user.user_certno
     *
     * @return  im_user.user_certno  ,用户的证件号码：用户的身份证号
     */
    public String getUser_certno() {
        return user_certno;
    }

    /**
     * 设置 用户的证件号码：用户的身份证号 字段:im_user.user_certno
     *
     * @param user_certno  im_user.user_certno,用户的证件号码：用户的身份证号
     */
    public void setUser_certno(String user_certno) {
        this.user_certno = user_certno == null ? null : user_certno.trim();
    }

    /**
     * 获取 用户的登录密码 字段:im_user.user_pwd
     *
     * @return  im_user.user_pwd  ,用户的登录密码
     */
    public String getUser_pwd() {
        return user_pwd;
    }

    /**
     * 设置 用户的登录密码 字段:im_user.user_pwd
     *
     * @param user_pwd  im_user.user_pwd,用户的登录密码
     */
    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd == null ? null : user_pwd.trim();
    }

    /**
     * 获取 0:强制要求修改 1:未强制要求修改 字段:im_user.user_initpwd
     *
     * @return  im_user.user_initpwd  ,0:强制要求修改 1:未强制要求修改
     */
    public String getUser_initpwd() {
        return user_initpwd;
    }

    /**
     * 设置 0:强制要求修改 1:未强制要求修改 字段:im_user.user_initpwd
     *
     * @param user_initpwd  im_user.user_initpwd,0:强制要求修改 1:未强制要求修改
     */
    public void setUser_initpwd(String user_initpwd) {
        this.user_initpwd = user_initpwd == null ? null : user_initpwd.trim();
    }

    /**
     * 获取 0:正常, 2:暂时冻结, 3:用户停用, 4:永久冻结 字段:im_user.user_stt
     *
     * @return  im_user.user_stt  ,0:正常, 2:暂时冻结, 3:用户停用, 4:永久冻结
     */
    public String getUser_stt() {
        return user_stt;
    }

    /**
     * 设置 0:正常, 2:暂时冻结, 3:用户停用, 4:永久冻结 字段:im_user.user_stt
     *
     * @param user_stt  im_user.user_stt,0:正常, 2:暂时冻结, 3:用户停用, 4:永久冻结
     */
    public void setUser_stt(String user_stt) {
        this.user_stt = user_stt == null ? null : user_stt.trim();
    }

    /**
     * 获取 用户信息描述 字段:im_user.user_desc
     *
     * @return  im_user.user_desc  ,用户信息描述
     */
    public String getUser_desc() {
        return user_desc;
    }

    /**
     * 设置 用户信息描述 字段:im_user.user_desc
     *
     * @param user_desc  im_user.user_desc,用户信息描述
     */
    public void setUser_desc(String user_desc) {
        this.user_desc = user_desc == null ? null : user_desc.trim();
    }

    /**
     * 获取 预留字段1 字段:im_user.user_remark1
     *
     * @return  im_user.user_remark1  ,预留字段1
     */
    public String getUser_remark1() {
        return user_remark1;
    }

    /**
     * 设置 预留字段1 字段:im_user.user_remark1
     *
     * @param user_remark1  im_user.user_remark1,预留字段1
     */
    public void setUser_remark1(String user_remark1) {
        this.user_remark1 = user_remark1 == null ? null : user_remark1.trim();
    }

    /**
     * 获取 预留字段2 字段:im_user.user_remark2
     *
     * @return  im_user.user_remark2  ,预留字段2
     */
    public String getUser_remark2() {
        return user_remark2;
    }

    /**
     * 设置 预留字段2 字段:im_user.user_remark2
     *
     * @param user_remark2  im_user.user_remark2,预留字段2
     */
    public void setUser_remark2(String user_remark2) {
        this.user_remark2 = user_remark2 == null ? null : user_remark2.trim();
    }

    /**
     * 获取 预留字段3 字段:im_user.user_remark3
     *
     * @return  im_user.user_remark3  ,预留字段3
     */
    public String getUser_remark3() {
        return user_remark3;
    }

    /**
     * 设置 预留字段3 字段:im_user.user_remark3
     *
     * @param user_remark3  im_user.user_remark3,预留字段3
     */
    public void setUser_remark3(String user_remark3) {
        this.user_remark3 = user_remark3 == null ? null : user_remark3.trim();
    }
}