package com.java.javase.java01_javabase.char06_array;

import java.util.Arrays;

//学习Arrays得使用及常用方法
public class ArraysTest {
    public static void main(String[] args) {
        int a[] = {1, 7, 8, 5};
        int c[] = {1, 7, 8, 5};
        System.out.println(a);
        System.out.println("复制之前的内容");
        for (int number : a
        ) {
            System.out.print(number);
        }
        System.out.println();
        System.out.println("复制之后的内容");
        //复制数组
        int[] b = Arrays.copyOfRange(a, 1, 3);
        for (int number : b
        ) {
            System.out.print(number);
        }
        System.out.println();
        //数组转字符串
        String arraycontent = Arrays.toString(a);
        System.out.println(arraycontent);
        Arrays.sort(a);
        System.out.println("排序之后得数组");
        System.out.println(Arrays.toString(a));
        //二分查找
        int index = Arrays.binarySearch(a, 8);
        System.out.println(index);
        //数组比较
        System.out.println(Arrays.equals(a,c));
        //数组填充
        Arrays.fill(c,1);
        System.out.println("int [] c is"+Arrays.toString(c));
    }
}
