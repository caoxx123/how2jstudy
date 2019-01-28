package com.java.javase.java01_javabase.char07_InterfaceAndExtends.Innerclass;

public class NotStaticInnerClass {
    //所谓的内部类即就是一个类作为另一个类的引用属性
    //要想实例化该内部类必须先实例化该内部类所在的类
//    语法: new 外部类().new 内部类()
//    作为Hero的非静态内部类，是可以直接访问外部类的private实例属性name的
    class Hero {

    }

    public static void main(String[] args) {
        NotStaticInnerClass notStaticInnerClass = new NotStaticInnerClass();
        Hero hreo = notStaticInnerClass.new Hero();
    }
}
