package com.java.javase.java01_javabase.char07_InterfaceAndExtends.abstractclass;

public abstract class NotExietsAbstractClass {
    String name;

    public static void main(String[] args) {
        //当一个class被声明为abstract的时候,不能直接实例化
        NotExietsAbstractClass notExietsAbstractClass = new NotExietsAbstractClass() {
        };
    }
    //接口和抽象类的区别
/*    区别1：
    子类只能继承一个抽象类，不能继承多个
    子类可以实现多个接口
    区别2：
    抽象类可以定义public,protected,package,private
    静态和非静态属性
    final和非final属性
    但是接口中声明的属性，只能是
    public静态final的
    即便没有显式的声明*/
}
