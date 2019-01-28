package com.java.javase.java01_javabase.char06_classandobject.SingletonModel;

public class God1 {
    //构造方法私有化,使得无法在外部new
    private   God1(){

    }
    //准备一个类属性,指向一个实例化对象,因为是类属性所以只有一个
    private static God1 instance=new God1();
    public static God1 getInstance(){
        return instance;
    }
}
