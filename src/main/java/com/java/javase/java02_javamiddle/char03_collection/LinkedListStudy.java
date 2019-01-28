package com.java.javase.java02_javamiddle.char03_collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//序列分先进先出FIFO,先进后出FILO
//FIFO在Java中又叫Queue 队列
//FILO在Java中又叫Stack 栈
public class LinkedListStudy {
    public static void main(String[] args) {
        //和ArrayList一样，LinkedList也实现了List接口
        List ll =new LinkedList<Hero>();

        //所不同的是LinkedList还实现了Deque，进而又实现了Queue这个接口
        //Queue代表FIFO 先进先出的队列
        Queue<Hero> q= new LinkedList<Hero>();

        //加在队列的最后面
        System.out.print("初始化队列：\t");
        q.offer(new Hero("Hero1"));
        q.offer(new Hero("Hero2"));
        q.offer(new Hero("Hero3"));
        q.offer(new Hero("Hero4"));

        System.out.println(q);
        System.out.print("把第一个元素取poll()出来:\t");
        //取出第一个Hero，FIFO 先进先出
        Hero h = q.poll();
        System.out.println(h);
        System.out.print("取出第一个元素之后的队列:\t");
        System.out.println(q);

        //把第一个拿出来看一看，但是不取出来
        h=q.peek();
        System.out.print("查看peek()第一个元素:\t");
        System.out.println(h);
        System.out.print("查看并不会导致第一个元素被取出来:\t");
        System.out.println(q);

       //LinkedList是一个双向链表结构的list
        LinkedList<Hero> ll1 =new LinkedList<Hero>();

        //所以可以很方便的在头部和尾部插入数据
        //在最后插入新的英雄
        ll1.addLast(new Hero("hero1"));
        ll1.addLast(new Hero("hero2"));
        ll1.addLast(new Hero("hero3"));
        System.out.println(ll1);

        //在最前面插入新的英雄
        ll1.addFirst(new Hero("heroX"));
        System.out.println(ll1);

        //查看最前面的英雄
        System.out.println(ll1.getFirst());
        //查看最后面的英雄
        System.out.println(ll1.getLast());

        //查看不会导致英雄被删除
        System.out.println(ll1);
        //取出最前面的英雄
        System.out.println(ll1.removeFirst());

        //取出最后面的英雄
        System.out.println(ll1.removeLast());

        //取出会导致英雄被删除
        System.out.println(ll);


    }
}
