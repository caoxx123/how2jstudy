package com.java.javase.java03_javahight.char01_reflection;

public class Relection0_Hero {
    static {
        System.out.println("获取类对象,会导致类被初始化");
    }
    String name;
    float hp;
    int damage;

    public Relection0_Hero() {
    }

    public Relection0_Hero(String name, float hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
