package com.java.javase.java01_javabase.char06_classandobject;
//继承由extends关键字说明
public class WeapenExtendsItem extends Item {
    int damage;

    public static void main(String[] args) {
        WeapenExtendsItem weapenExtendsItem = new WeapenExtendsItem();
        weapenExtendsItem.name = "闪电匕首";
        weapenExtendsItem.price = 1232;
        weapenExtendsItem.damage = 100;
        System.out.println(weapenExtendsItem.toString());
        weapenExtendsItem.ItemMethod();
        weapenExtendsItem.ItemMethod(1);
    }

    @Override
    public String toString() {
        return "物品名称:" + this.name + " 物品价格:" + this.price + " 物品伤害:" + this.damage;
    }
    //重载的要点:方法名相同,参数列表不同。
    public void  ItemMethod(int i ){
        System.out.println("subClass 的方法");
    }
}
