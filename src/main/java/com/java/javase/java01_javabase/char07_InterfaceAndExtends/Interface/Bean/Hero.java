package com.java.javase.java01_javabase.char07_InterfaceAndExtends.Interface.Bean;

public class Hero {
    private String name;
    private int HP;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
    public void sayBangbang(){
        System.out.println("hero");
    }
}
