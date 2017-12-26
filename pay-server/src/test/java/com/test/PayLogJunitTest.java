package com.test;

import com.afcat.common.entity.ResultSupport;
import com.afcat.common.service.PayLogService;
import com.afcat.common.vo.PayLog;
import com.afcat.server.util.LogUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by xn.L on 2017/12/21.
 */
public class PayLogJunitTest extends SpringServiceJunitTest{
    @Autowired
    private PayLogService payLogService;
    @Test
    public void success(){
        LogUtil.writeSuccessLog("127.0.0.2","mac","PayLogJunitTest","0000");
    }

    @Test
    public void unsuccess(){
        LogUtil.writeUnSuccessLog("127.0.0.2","mac","PayLogJunitTest","失败","1001");
    }

    @Test
    public void getErrorLog(){
        ResultSupport<List<PayLog>> support = payLogService.queryErrorLog();
        System.out.println("状态："+support.isSuccess());
        System.out.println("状态码："+support.getResultCode());
        System.out.println("信息："+support.getRemark());
        for (PayLog log:support.getModel()){
            System.out.println("错误信息:"+log.getLogMsg()+",错误码:"+log.getLogErrorcode());
        }
    }
}
