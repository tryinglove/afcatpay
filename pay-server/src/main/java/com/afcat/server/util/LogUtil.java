package com.afcat.server.util;

import com.afcat.common.util.DateUtil;
import com.afcat.common.util.IDUtil;
import com.afcat.common.vo.PayLog;
import com.afcat.dal.dao.PayLogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by xn.L on 2017/12/21.
 * 记录日志入库
 */
@Component
public class LogUtil {
    @Autowired
    private  PayLogDao logDao ;

    private static LogUtil logUtil;

    @PostConstruct
    private void init() {
        logUtil = this;
    }

    public  static void writeSuccessLog(String ip,String mac,String clazz,String msg){
        PayLog log = new PayLog();
        log.setLogId(IDUtil.getId());
        log.setLogIp(ip);
        log.setLogMac(mac);
        log.setLogMsg(msg);
        log.setLogClass(clazz);
        log.setLogTime(DateUtil.getNowTime());
        try{
            logUtil.logDao.writeLog(log);
        }catch (Exception e){
            //捕获异常,不阻断业务
        }
    }

    public static void writeUnSuccessLog(String ip,String mac,String clazz,String msg,String errorCode){
        PayLog log = new PayLog();
        log.setLogId(IDUtil.getId());
        log.setLogIp(ip);
        log.setLogMac(mac);
        log.setLogMsg(msg);
        log.setLogClass(clazz);
        log.setLogErrorcode(errorCode);
        log.setLogTime(DateUtil.getNowTime());
        try{
            logUtil.logDao.writeLog(log);
        }catch (Exception e){
            //捕获异常,不阻断业务
        }
    }
}
