package com.java.javase.java01_javabase.char07_InterfaceAndExtends.polymorphic;

public class Item {
    String name;
    int price;
    public void effect(){
        System.out.println("执行后有该效果");
    }


    public static void main(String[] args) {
//        要实现类的多态，需要如下条件
//        1. 父类（接口）引用指向子类对象
//        2. 调用的方法有重写
        Item item=new BoolCupItem();
        Item item1=new BlueCupItem();
        item.effect();
        item1.effect();
    }
    @Override
    public String toString() {
        return "name;"+this.name+"price:"+this.price;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this+"正在被回收");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Item){
            if (((Item) obj).price==this.price){
                return true;
            }
        }else{
            return false;
        }
        return false;
    }
}
