package com.afcat.common.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by john on 2017/12/18.
 * util for date
 */
public class DateUtil {
    private final static String DEFAULT_TIME_FORMAT = "yyyyMMddHHmmss";
    /**
     * 获取格式化的服务器时间
     * @param format
     *          日期模板：yyyyMMddHHmmss,yyyyMMdd...etc
     * @return String 生成的时间
     */

    public static String getNowTime(String format){
        String timeFormat = (format == null)?DEFAULT_TIME_FORMAT:format;

        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat(timeFormat);

        return formatter.format(date);
    }

    public static String getNowTime(){
        String timeFormat = DEFAULT_TIME_FORMAT;

        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat(timeFormat);

        return formatter.format(date);
    }
}
