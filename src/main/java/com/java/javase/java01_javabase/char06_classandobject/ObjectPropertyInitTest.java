package com.java.javase.java01_javabase.char06_classandobject;

public class ObjectPropertyInitTest {
    //对象属性初始化有三种
   //方式1;声明属性的时候初始化
    String name="kugou";
    int age;
    float hight;
    //方式2:构造方法中初始化
    public ObjectPropertyInitTest() {
        age=10;
    }
    //方式3:初始化代码块
    {
        hight=10f;
    }

    public static void main(String[] args) {
        ObjectPropertyInitTest objectPropertyInitTest=new ObjectPropertyInitTest();
        System.out.println(objectPropertyInitTest.toString());
    }

    @Override
    public String toString() {
        return "this object name is"+this.name+" this age is "+this.age+" this hight "+this.hight;
    }
}
