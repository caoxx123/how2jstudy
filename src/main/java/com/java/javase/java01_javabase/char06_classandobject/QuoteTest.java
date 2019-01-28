package com.java.javase.java01_javabase.char06_classandobject;

public class QuoteTest {
    public static void main(String[] args) {
        //Gralen为一个引用
        Hero Gralen = new Hero();
        System.out.println(Gralen.hashCode());
        Gralen = new Hero();
        System.out.println(Gralen.hashCode());
        Hero MoonGod=new Hero("Moongod",100f,1000,900);
        System.out.println(MoonGod.toString());
        System.out.println(MoonGod.hashCode());
        System.out.println("该类有了"+Hero.current+"个实例化对象");
        /* 该代码的执行结果
        460141958
        1163157884
        */
    }
}
