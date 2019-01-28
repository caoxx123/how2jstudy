package com.java.javase.java01_javabase.char07_InterfaceAndExtends.Interface.objectcast;

import com.java.javase.java01_javabase.char07_InterfaceAndExtends.Interface.Bean.Hero;
import com.java.javase.java01_javabase.char07_InterfaceAndExtends.Interface.InterfaceImpl.ADHero;
import com.java.javase.java01_javabase.char07_InterfaceAndExtends.Interface.InterfaceImpl.ADPHero;

public class ObjectCastTest {
    public static void main(String[] args) {
        //上转型不会报错
        Hero hero = new ADPHero();
        ((ADPHero) hero).APattack();

        ADPHero adpHero=new ADPHero();
        ADHero adHero=new ADHero();
        //instanceof用于判断引用指向的是否是某个类或者他的子类
        adpHero.sayByebye();
        System.out.println(hero instanceof Hero);
        System.out.println(hero instanceof ADPHero);
        System.out.println(adHero instanceof ADHero);
        //下转型会报错
        //ADPHero adpHero=new Hero();

    }
}
