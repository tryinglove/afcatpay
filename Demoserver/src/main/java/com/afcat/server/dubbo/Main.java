package com.afcat.server.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by john on 2017/12/8.
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath*:spring-dao.xml",
                "classpath:spring-service.xml","classpath:spring-redis-config.xml","classpath:spring-dubbo.xml"});
        System.out.println("加载配置文件成功");
        context.start();
        System.out.println("启动dubbo服务");
        System.in.read();
    }
}
