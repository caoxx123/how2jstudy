package com.java.javase.java01_javabase.char02_facetoobject;
//class
public class Hero {
    //描述class状态的叫做属性
    //英雄名称
    String name;
    //英雄的血量
    float hp;
    //英雄的护甲
    float armor;
    //英雄的移速
    int movespeed;
    //class的行为称作方法
    public void lgendary() {
        System.out.println("你超神了");
    }

    public float getHp() {
        return this.hp;
    }

    public void recovyboold(float boold) {
        this.hp+=100f;
    }
}
