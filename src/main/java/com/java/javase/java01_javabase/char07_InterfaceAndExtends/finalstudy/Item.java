package com.java.javase.java01_javabase.char07_InterfaceAndExtends.finalstudy;

public class Item {
//    常量指确定的不会修改的值
    private static final int ItemsNumber=6;
    String name;
    int price;
    public final void sayItem(){
        final int price;
        price=5;
//        price=6;//提示不允许再次赋值
        System.out.println("说Item就是Ttem");
    }
}
