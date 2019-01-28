package com.java.javase.java01_javabase.char09_dateandcalendar;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        //创建获取当前时间
        Date date=new Date();
        //创建指定的时间 从1970年1月1日 早上8点0分0秒 开始经历了5秒的时间
        Date date1=new Date(5000);
        date.getTime();//getTime() 得到一个long型的整数,这个整数代表 从1970.1.1 08:00:00:000 开始 每经历一毫秒，增加1
        System.out.println(date1.getTime());
        System.currentTimeMillis();//当前机器的毫秒数
    }
}
