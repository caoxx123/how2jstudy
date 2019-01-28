package com.java.javase.java01_javabase.char09_dateandcalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static void main(String[] args) {
        //采用单例模式获取到日历对象
        Calendar c=Calendar.getInstance();
        //通过日历对象获取到日期对象
        Date now=c.getTime();
        // 当前日期
        System.out.println("当前日期：\t" + format(c.getTime()));

        // 下个月的今天
        c.setTime(now);
        c.add(Calendar.MONTH, 1);
        System.out.println("下个月的今天:\t" +format(c.getTime()));

        // 去年的今天
        c.setTime(now);
        c.add(Calendar.YEAR, -1);
        System.out.println("去年的今天:\t" +format(c.getTime()));

        // 上个月的第三天
        c.setTime(now);
        c.add(Calendar.MONTH, -1);
        c.set(Calendar.DATE, 3);
        System.out.println("上个月的第三天:\t" +format(c.getTime()));
    }
    private static String format(Date time) {
        return sdf.format(time);
    }
}
