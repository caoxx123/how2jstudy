package com.java.javase.java01_javabase.char06_classandobject;

public class Hero {
    //被static修饰的称作类属性,同理被static关键字修饰的方法叫类方法
    public static int current=0;
    String name;
    float hp;
    int damage;
    float arror;
    //如果在class中没有显式的编写该类的构造方法,则调用默认的无参构造方法
    Hero(){
        System.out.println("Hero对象被实例化了");
        current+=1;
    }

    public Hero(String name, float hp, int damage, float arror) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.arror = arror;
        System.out.println("Hero对象被实例化了");
        current+=1;
    }

    @Override
    public String toString() {
        return "this hero name is "+this.name+" hp is "+this.hp+" damage is "+this.damage+" arror is "+this.arror;
    }

    public static void  test(){
        System.out.println("我是一个类方法");
    }
}
