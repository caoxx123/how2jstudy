package com.java.javase.java01_javabase.char08_digitandstring;

public class StringBufferStudy {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer();
        //获取StringBuffer的容量
        System.out.println(stringBuffer.capacity());
        //获取StringBuffer的长度
        System.out.println(stringBuffer.length());
        //在尾部追加
        stringBuffer.append("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.length());
        //插入
        stringBuffer.insert(1,"111");
        System.out.println(stringBuffer);
        //删除
        stringBuffer.delete(7,20);
        System.out.println(stringBuffer);
        //反转
        stringBuffer.reverse();
        System.out.println(stringBuffer);
    }
}
