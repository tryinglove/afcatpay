package com.afcat.server.dubbo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by john on 2017/12/8.
 *
 */
public class Main {
    private static Log logger = LogFactory.getLog(Main.class);
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
         "classpath*:spring-dao.xml","classpath:spring-service.xml","classpath:spring-redis-config.xml","classpath:spring-dubbo.xml");
        logger.info("加载配置文件成功");
        context.start();
        logger.info("启动dubbo服务");
        System.in.read();
    }
}
