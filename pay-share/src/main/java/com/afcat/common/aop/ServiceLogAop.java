package com.afcat.common.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * Created by john on 2017/12/12.
 * 使用aop打印service日志
 */

public class ServiceLogAop implements MethodInterceptor{
    final static Log logger = LogFactory.getLog(ServiceLogAop.class);
    ObjectMapper jsonMapper = new ObjectMapper();
    public Object invoke(MethodInvocation invocation) throws Throwable {

        String serviceName = invocation.getThis().getClass().getSimpleName();
        StringBuffer sb = new StringBuffer();
        sb.append("开始执行:");
        sb.append(serviceName);
        sb.append(",输入参数为:");
        //获取传入参数
        Object[] params = invocation.getArguments();

        String strParam = "";
        if(null != params){
            strParam = jsonMapper.writeValueAsString(params);
        }
        sb.append(strParam);
        logger.info(sb.toString());
        //获取输出参数
        Object result = invocation.proceed();
        String strResult = "";
        sb = new StringBuffer();
        sb.append("服务执行结束:");
        sb.append(serviceName);
        sb.append(",返回值为:");
        if(null != result){
            strResult = jsonMapper.writeValueAsString(result);
        }
        sb.append(strResult);
        logger.info(sb.toString());
        //一定要返回result
        return result;
    }
}
