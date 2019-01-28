package com.java.javase.java02_javamiddle.char03_collection;

import java.util.*;

public class Comparter {
//    假设Hero有三个属性 name,hp,damage
//    一个集合中放存放10个Hero,通过Collections.sort对这10个进行排序
//    那么到底是hp小的放前面？还是damage小的放前面？Collections.sort也无法确定
//            所以要指定到底按照哪种属性进行排序
//    这里就需要提供一个Comparator给定如何进行两个对象之间的大小比较
public static void main(String[] args) {
    Random r =new Random();
    List<Hero> heros = new ArrayList<Hero>();

    for (int i = 0; i < 10; i++) {
        //通过随机值实例化hero的hp和damage
        heros.add(new Hero( r.nextInt(100),"hero "+ i, r.nextInt(100)));
    }
    System.out.println("初始化后的集合：");
    System.out.println(heros);

    //直接调用sort会出现编译错误，因为Hero有各种属性
    //到底按照哪种属性进行比较，Collections也不知道，不确定，所以没法排
    //Collections.sort(heros);

    //引入Comparator，指定比较的算法
    Comparator<Hero> c = new Comparator<Hero>() {
        @Override
        public int compare(Hero h1, Hero h2) {
            //按照hp进行排序
            if(h1.hp>=h2.hp)
                return 1;  //正数表示h1比h2要大
            else
                return -1;
        }
    };
    //借助Comparable接口，使Item具备按照价格从高到低排序。
    // public class Item implements LOL ,Comparable<Item>{
    //    public String name;
    //    public int price;
    //
    //    public Item(){
    //
    //    }
    //
    //    public Item(String name){
    //        this.name = name;
    //    }
    //
    //    public void effect(){
    //        System.out.println("物品使用后，可以有效果");
    //    }
    //
    //    public boolean disposable() {
    //        return false;
    //    }
    //
    //    @Override
    //    public int compareTo(Item o) {
    //        return o.price-price;
    //    }
    //
    //    @Override
    //    public String toString() {
    //        return "Item [name=" + name + ", price=" + price + "]\r\n";
    //    }
    Collections.sort(heros,c);
    System.out.println("按照血量排序后的集合：");
    System.out.println(heros);
}
}
