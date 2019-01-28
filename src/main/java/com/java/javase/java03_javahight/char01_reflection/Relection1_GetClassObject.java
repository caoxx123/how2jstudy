package com.java.javase.java03_javahight.char01_reflection;

public class Relection1_GetClassObject {
//    类对象概念： 所有的类，都存在一个类对象，
//    这个类对象用于提供类本身的信息，比如有几种构造方法， 有多少属性，有哪些普通方法。
//    获取类对象有3种方式
//1. Class.forName
//2. Hero.class
//3. new Hero().getClass()
public static void main(String[] args) {
    String className="com.java.javase.java03_javahight.char01_reflection.Relection0_Hero";
    try {
        Class pclass=Class.forName(className);
        Class pclass1=Relection0_Hero.class;
        Class pclass2=new Relection0_Hero().getClass();
        System.out.println((pclass==pclass1)&&(pclass1==pclass2));
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
}
}
