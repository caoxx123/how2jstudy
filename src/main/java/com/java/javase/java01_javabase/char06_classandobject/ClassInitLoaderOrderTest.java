package com.java.javase.java01_javabase.char06_classandobject;
//测试静态代码块,构造方法的执行顺序
//在执行过程中静态代码块比构造方法先执行,静态代码块只在第一次实例化的时候执行一次
public class ClassInitLoaderOrderTest {
    static {
        System.out.println("静态代码块执行");
    }
    ClassInitLoaderOrderTest(){
        System.out.println("我是构造方法");
    }

    public static void main(String[] args) {
        ClassInitLoaderOrderTest classInitLoaderOrderTest=new ClassInitLoaderOrderTest();
        ClassInitLoaderOrderTest classInitLoaderOrderTest1=new ClassInitLoaderOrderTest();
    }
}
