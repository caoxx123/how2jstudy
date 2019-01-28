package com.java.javase.java01_javabase.char07_InterfaceAndExtends.finalstudy;

import com.java.javase.java01_javabase.char07_InterfaceAndExtends.Interface.Bean.Hero;

public class FinalmodfiyClass extends Item { //extends TestFinal报错,提示不能够继承被final修饰的类
    public static void main(String[] args) {
        final Hero hero;
        hero = new Hero();
//        hero = new Hero();提示该引用只能赋值一次
    }

//    public final void sayItem() { 提示该方法不允许重写
//        System.out.println("说Item就是Ttem");
//    }
}
