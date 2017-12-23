package com.afcat.common.util;

import java.util.UUID;

/**
 * Created by xn.L on 2017/12/21.
 * uuid生成器
 */
public class IDUtil {
    /**
     * 获取生成的UUID
     */
    public static String  getId(){
        String uuid = UUID.randomUUID().toString();
        uuid = uuid.replace("-","");
        return uuid;
    }

    public static void main(String[] args) {
       String  id =  IDUtil.getId();
        System.out.println(id);
        System.out.println(id.length());
    }
}
