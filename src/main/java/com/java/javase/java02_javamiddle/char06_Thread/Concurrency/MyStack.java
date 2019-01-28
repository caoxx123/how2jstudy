package com.java.javase.java02_javamiddle.char06_Thread.Concurrency;

import java.util.LinkedList;

public class MyStack<T> {

    LinkedList<T> values = new LinkedList<T>();

    public synchronized void push(T t) {
        while(values.size()>=4){
            try {
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        this.notifyAll();
        values.addLast(t);

    }

    public synchronized T pull() {
        while(values.isEmpty()){
            try {
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        this.notifyAll();
        return values.removeLast();
    }

    public T peek() {
        return values.getLast();
    }
}

