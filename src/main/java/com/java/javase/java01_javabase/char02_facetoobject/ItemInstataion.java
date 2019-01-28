package com.java.javase.java01_javabase.char02_facetoobject;

public class ItemInstataion {
    public static void main(String[] args) {
        Item booldcup = new Item();
        booldcup.name = "血瓶";
        booldcup.price = 50;
        Item strawsandals = new Item();
        strawsandals.name = "草鞋";
        strawsandals.price = 100;
        Item longSword = new Item();
        longSword.name = "长剑";
        longSword.price = 350;
        System.out.println("booldcuo;" + booldcup.name + booldcup.price);
        System.out.println("strawsandals" + strawsandals.name + strawsandals.price);
        System.out.println("longsworo" + longSword.name + longSword.price);
        booldcup.ItemName();
        strawsandals.ItemName();
        longSword.ItemName();
    }
}
