package com.java.javase.java01_javabase.char07_InterfaceAndExtends.Interface.InterfaceImpl;

import com.java.javase.java01_javabase.char07_InterfaceAndExtends.Interface.ADable;
import com.java.javase.java01_javabase.char07_InterfaceAndExtends.Interface.APable;
import com.java.javase.java01_javabase.char07_InterfaceAndExtends.Interface.Bean.Hero;

public class ADPHero extends Hero implements APable, ADable {
    public void physicAttackt() {
        System.out.println("我是一个有物理攻击能力的类");
    }

    public void APattack() {
        System.out.println("我是一个有法术攻击能力的类");
    }

    @Override
    public void sayBangbang() {
        System.out.println("ADPHero");
    }
}
