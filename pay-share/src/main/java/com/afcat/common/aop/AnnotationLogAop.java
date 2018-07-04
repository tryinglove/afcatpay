package com.afcat.common.aop;

import com.afcat.common.annontation.LogLevel;
import com.afcat.common.annontation.ShowLog;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.map.ObjectMapper;

import java.lang.reflect.Method;

/**
 * Created by xn.L on 2018/5/25.
 * 对于扫描到的需要日志注解处理的方法进行处理。
 */
public class AnnotationLogAop implements MethodInterceptor {

    final static Log logger = LogFactory.getLog(ServiceLogAop.class);
    ObjectMapper jsonMapper = new ObjectMapper();

    public Object invoke(MethodInvocation invocation) throws Throwable {

        Method method = invocation.getMethod();

        Object result = invocation.proceed();
        if (method.isAnnotationPresent(ShowLog.class)) {
            ShowLog log = method.getAnnotation(ShowLog.class);

            if (log.level().equals(LogLevel.WRITE)) {
                writeLog(invocation);
            } else {
                insertLog(invocation);
            }
        }
        return result;
    }

    /**
     *
     * @param invocation
     * @throws Throwable
     * 打印日志的方法
     */
    private void writeLog(MethodInvocation invocation) throws Throwable {
        String methodName = invocation.getThis().getClass().getSimpleName();
        StringBuffer sb = new StringBuffer();
        sb.append("开始执行:");
        sb.append(methodName);
        sb.append(",输入参数为:");
        Object[] params = invocation.getArguments();
        String strParam = "";
        if (null != params) {
            strParam = jsonMapper.writeValueAsString(params);
        }
        sb.append(strParam);
        logger.info(sb.toString());
        //获取输出参数
        Object result = invocation.proceed();
        String strResult = "";
        sb = new StringBuffer();
        sb.append("服务执行结束:");
        sb.append(methodName);
        sb.append(",返回值为:");
        if (null != result) {
            strResult = jsonMapper.writeValueAsString(result);
        }
        sb.append(strResult);
        sb.append(strParam);
        logger.info(sb.toString());
    }

    /**
     *
     * @param invocation
     * 入库日志的方法
     */
    private void insertLog(MethodInvocation invocation) {

    }
}
