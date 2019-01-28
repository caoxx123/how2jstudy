package com.java.javase.java01_javabase.char09_dateandcalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args){
/*        //y 代表年
        //M 代表月
        //d 代表日
        //H 代表24进制的小时
        //h 代表12进制的小时
        //m 代表分钟
        //s 代表秒
        //S 代表毫秒*/
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat();
        Date date=new Date();
        simpleDateFormat.format(date);
        System.out.println(simpleDateFormat.format(date));

        SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss" );

        String str = "2016/1/5 12:12:12";
        Date date1= null;
        try {
            date1 = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date1);
    }
}
