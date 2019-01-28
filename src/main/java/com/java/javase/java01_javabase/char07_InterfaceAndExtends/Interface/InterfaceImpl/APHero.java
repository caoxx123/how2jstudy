package com.java.javase.java01_javabase.char07_InterfaceAndExtends.Interface.InterfaceImpl;

import com.java.javase.java01_javabase.char07_InterfaceAndExtends.Interface.APable;
import com.java.javase.java01_javabase.char07_InterfaceAndExtends.Interface.Bean.Hero;

public class APHero extends Hero implements APable {
    public void APattack() {
        System.out.println("我是有一个法术攻击能力的英雄");
    }

    @Override
    public void sayBangbang() {
        System.out.println("APHero");
    }
}
