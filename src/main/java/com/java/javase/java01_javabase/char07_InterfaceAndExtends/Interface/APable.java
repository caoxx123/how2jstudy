package com.java.javase.java01_javabase.char07_InterfaceAndExtends.Interface;
//定义法术攻击的接口
public interface APable {
    //定义法术攻击的方法
    public void APattack();
//    default void test(){
//       System.out.println("default");
//    }
default void sayByebye(){
    System.out.println("default mehtod: say byebye");
}
}
