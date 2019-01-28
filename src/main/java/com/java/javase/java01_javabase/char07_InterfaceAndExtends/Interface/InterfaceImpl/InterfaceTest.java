package com.java.javase.java01_javabase.char07_InterfaceAndExtends.Interface.InterfaceImpl;

public class InterfaceTest {
    public static void main(String[] args) {
        ADHero adHero=new ADHero();
        APHero apHero=new APHero();
        ADPHero adpHero=new ADPHero();
        System.out.println(adHero);
        adHero.physicAttackt();
        adHero.sayBangbang();
        System.out.println(apHero);
        apHero.APattack();
        apHero.sayBangbang();
        System.out.println(adpHero);
        adpHero.APattack();
        adpHero.physicAttackt();
        adpHero.sayBangbang();
    }
}
