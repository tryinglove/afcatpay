package com.afcat.common.service;

import com.afcat.common.entity.ResultSupport;
import com.afcat.common.vo.PayLog;

import java.util.List;

/**
 * Created by xn.L on 2017/12/26.
 * 提供监控日志服务
 */
public interface PayLogService {
    ResultSupport<List<PayLog>> queryErrorLog();
}
