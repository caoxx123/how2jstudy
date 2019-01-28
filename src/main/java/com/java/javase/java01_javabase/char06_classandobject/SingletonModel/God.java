package com.java.javase.java01_javabase.char06_classandobject.SingletonModel;

public class God {
    //私有化构造方法,使得该类无法在外部通过new进行实例化
    private God(){

    }
    //准备一个类属性,用于指向一个实例化对象,但是暂时指向null
    public static God instance;
    //
    public static God getInstance(){
        //第一次访问时发现instance指向的是null,则实例化一个God对象
        if(null==instance){
            instance=new God();
        }
        //返回实例化的对象
        return  instance;
    }
}
