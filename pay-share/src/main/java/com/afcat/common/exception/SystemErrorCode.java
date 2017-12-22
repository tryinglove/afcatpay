package com.afcat.common.exception;

/**
 * Created by xn.L on 2017/12/22.
 * 系统类错误码
 */
public class SystemErrorCode extends BaseErrorCode {
    /**
     * 错误码规则:
     * S(错误类型)NNN(子系统编码)00000(错误编号)
     * 例:权限系统通信异常 SSER00001
     */
    private static final String SSER00001 = "SSER00001";
    /**
     * 权限系统数据库通信异常
     */
    private static final String SSER00002 = "SSER00002";
}

