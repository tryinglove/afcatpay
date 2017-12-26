package com.afcat.server.service.impl;

import com.afcat.common.entity.ResultSupport;
import com.afcat.common.service.PayLogService;
import com.afcat.common.vo.PayLog;
import com.afcat.dal.dao.PayLogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xn.L on 2017/12/26.
 * 监控日志服务实现
 */
@Service
public class PayLogServiceImpl implements PayLogService{
    @Autowired
    private PayLogDao logDao;
    public ResultSupport<List<PayLog>> queryErrorLog() {
        List<PayLog> logList= logDao.queryErrorLog();
        return ResultSupport.getInstance(true,"0000","[查询成功]",logList);
    }
}
