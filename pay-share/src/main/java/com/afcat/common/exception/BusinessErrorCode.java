package com.afcat.common.exception;

/**
 * Created by xn.L on 2017/12/22.
 *  业务类错误码
 */
public class BusinessErrorCode extends BaseErrorCode{
    /**
     * 错误码规则:
     * B(错误类型)NNN(子系统编码)00000(错误编号)
     * 例:管理系统用户名为空 BMAN00001
     */
    private static final String BMAN00001 = "BMAN00001";
    /**
     * 管理系统权限不足
     */
    private static final String BMAN00002 = "BMAN00002";
}
