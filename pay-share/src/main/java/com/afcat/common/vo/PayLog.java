package com.afcat.common.vo;

/**
 * Created by xn.L on 2017/12/21.
 * 记录日志
 */
public class PayLog {
    private String logId;
    private String logIp;
    private String logMac;
    //0：成功，1：失败
    private String logSuccess;
    private String logClass;
    private String logMsg;
    private String logTime;
    public String getLogTime(){
        return logTime;
    }
    public void setLogTime(String logTime){
        this.logTime = logTime;
    }
    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getLogIp() {
        return logIp;
    }

    public void setLogIp(String logIp) {
        this.logIp = logIp;
    }

    public String getLogMac() {
        return logMac;
    }

    public void setLogMac(String logMac) {
        this.logMac = logMac;
    }

    public String getLogSuccess() {
        return logSuccess;
    }

    public void setLogSuccess(String logSuccess) {
        this.logSuccess = logSuccess;
    }

    public String getLogClass() {
        return logClass;
    }

    public void setLogClass(String logClass) {
        this.logClass = logClass;
    }

    public String getLogMsg() {
        return logMsg;
    }

    public void setLogMsg(String logMsg) {
        this.logMsg = logMsg;
    }

    public String getLogErrorcode() {
        return logErrorcode;
    }

    public void setLogErrorcode(String logErrorcode) {
        this.logErrorcode = logErrorcode;
    }

    private String logErrorcode;


}
