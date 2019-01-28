package com.java.javase.java01_javabase.char05_choseandloop;
//测试循环
public class TestLoop {
    public static void main(String[] args) {
        //for循环
        for (int i = 0; i < 5; i++) {

        }
        System.out.println("这是一个for循环");
        //while循环
        int j = 0;
        while (j < 4) {
            j++;
            if (j == 4) {
                System.out.println("这是一个for循环");
            }
        }
//        System.out.println("这是一个for循环");
        //do while循环
        do {
            j++;
            System.out.println(j);
        } while (j < 4);
    }
}
