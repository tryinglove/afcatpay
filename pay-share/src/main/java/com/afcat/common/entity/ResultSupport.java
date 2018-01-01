package com.afcat.common.entity;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.io.Serializable;

/**
 * Created by john on 2017/12/21.
 */
public class ResultSupport<T> implements Serializable {
    /**
     * 备注
     */
    private String remark;
    /**
     * 返回编号
     */
    private String resultCode;
    /**
     * 是否成功
     */
    private boolean isSuccess = false;
    /**
     * 装载对象
     */
    private T model;
    /**
     *异常
     */
    private Exception exception;

    /**
     * @return 返回成功的实例
     */
    public static<T> ResultSupport<T> getInstance(boolean expr,String resultCode,String msg,T model){
        ResultSupport<T> result = new ResultSupport<T>();
        result.setSuccess(expr);
        result.setResultCode(resultCode);
        result.setRemark(msg);
        result.setModel(model);

        return result;
    }
    /**
     * @return 返回失败的实例
     */
    public static<T> ResultSupport<T> getInstance(Exception e){
        ResultSupport<T> result = new ResultSupport<T>();
        result.setException(e);
        result.setSuccess(false);
        String msg = "系统异常";
        if(null != e.getMessage()&&!e.getMessage().equals("")){
            msg = e.getMessage();
        }
        result.setRemark(msg);
        return result;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }
    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

}
