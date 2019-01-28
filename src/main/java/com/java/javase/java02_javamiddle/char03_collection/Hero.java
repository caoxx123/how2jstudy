package com.java.javase.java02_javamiddle.char03_collection;

public class Hero {
    public int hp;
    String name;
    public int damage;

    public Hero(String name) {
        this.name = name;
    }

    public Hero(int hp, String name, int damage) {
        this.hp = hp;
        this.name = name;
        this.damage = damage;
    }
}
