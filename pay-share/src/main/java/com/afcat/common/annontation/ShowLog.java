package com.afcat.common.annontation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by xn.L on 2018/5/25.
 * 日志注解，用于方法，被扫描的方法打印日志。
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ShowLog {
    LogLevel level() default LogLevel.WRITE;

}
