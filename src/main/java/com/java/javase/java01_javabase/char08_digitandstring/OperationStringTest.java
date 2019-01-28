package com.java.javase.java01_javabase.char08_digitandstring;

public class OperationStringTest {
    /*    charAt	获取字符
        toCharArray	获取对应的字符数组
        subString	截取子字符串
        split	分隔
        trim	去掉首尾空格
        toLowerCase toUpperCase	大小写
        indexOf lastIndexOf contains	定位
        replaceAll replaceFirst	替换*/
    public static void main(String[] args) {
    String s="qwertyuikcghijfafnkbvhoiopa,fn,oanojaovnoavnoanvv ";
        System.out.println("s的第二个字符是"+s.charAt(2));
        System.out.println(s.substring(2));
        System.out.println(s.split(","));
        System.out.println(s.trim());
        System.out.println(s);
        System.out.println(s.toLowerCase());
        System.out.println(s);
        System.out.println(s.toUpperCase());
        System.out.println(s);
        System.out.println(s.indexOf("a"));
        System.out.println(s.lastIndexOf("a"));
        System.out.println(s.contains("vv"));
        System.out.println(s);
        System.out.println(s.replace('v','V'));

    }
}
