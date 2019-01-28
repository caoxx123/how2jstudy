package com.java.javase.java01_javabase.char07_InterfaceAndExtends.Interface.InterfaceImpl;

import com.java.javase.java01_javabase.char07_InterfaceAndExtends.Interface.ADable;
import com.java.javase.java01_javabase.char07_InterfaceAndExtends.Interface.Bean.Hero;

public class ADHero extends Hero implements ADable {
    public void physicAttackt() {
        System.out.println("我是一个有物理攻击能力的英雄");
    }

    @Override
    public void sayBangbang() {
        System.out.println("ADhero");;
    }
}
