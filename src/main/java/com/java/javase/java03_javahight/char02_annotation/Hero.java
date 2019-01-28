package com.java.javase.java03_javahight.char02_annotation;

@MyEntity
@MyTable(name = "hero_")
public class Hero {
    private int id;
    private String name;
    private int damage;
    private int armor;

    @MyId
    @MyGeneratedValue(strtragy = "identity")
    @MyColumn(value = "ID_")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @MyColumn(value = "Naem_")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @MyColumn(value = "Damage")
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    @MyColumn(value = "Armor_")
    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
