package com.java.javase.java01_javabase.char07_InterfaceAndExtends.Innerclass;

public class NativeInnerClass {
    //    本地类可以理解为有名字的匿名类
//    内部类与匿名类不一样的是，内部类必须声明在成员的位置，即与属性和方法平等的位置。
//    本地类和匿名类一样，直接声明在代码块里面，可以是主方法，for循环里等等地方


    public static void main(String[] args) {

        class NativeInnerClass1 extends NativeInnerClass {

        }
        NativeInnerClass1 nativeInnerClass1=new NativeInnerClass1();
    }
}
