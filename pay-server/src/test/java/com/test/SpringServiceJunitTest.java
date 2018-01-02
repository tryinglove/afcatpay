package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by john on 2017/12/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-dao.xml","classpath:spring-service.xml","classpath:spring-redis-config.xml"})
public class SpringServiceJunitTest {
    @Test
    public void testForMaven(){
        System.out.println("----");
    }
}
