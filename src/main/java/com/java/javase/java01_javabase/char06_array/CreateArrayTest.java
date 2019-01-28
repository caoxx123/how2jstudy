package com.java.javase.java01_javabase.char06_array;
//创建数组的几种方式
public class CreateArrayTest {
    public static void main(String[] args) {
        //方式一,数组的创建跟赋值分步进行
        //创建数组
        int[] intsArray = new int[5];
        //给数组赋值
        for (int i = 0; i < 5; i++) {
            intsArray[i] = i;
        }
        //输出赋值后的数组
        System.out.println(intsArray);
        for (int i = 0; i < intsArray.length; i++) {
            if (i == intsArray.length - 1) {
                System.out.print(intsArray[i]);
            } else {
                System.out.print(intsArray[i] + ",");
            }
        }
        //方法二:省略new int[]
        int[] ints = {1, 3, 4, 5};
        System.out.println();
        System.out.println(ints);
        for (int i = 0; i < ints.length; i++) {
            if (i == ints.length - 1) {
                System.out.print(ints[i]);
            } else {
                System.out.print(ints[i] + ",");
            }
        }
        System.out.println();
        //方式三:创建跟赋值同时进行
        int[] intsArray1 = new int[]{1, 2, 3, 4, 5};
        System.out.println(intsArray1);
        for (int i = 0; i < intsArray1.length; i++) {
            if (i == intsArray1.length - 1) {
                System.out.print(intsArray1[i]);
            }else{
                System.out.print(intsArray1[i]+",");
            }
        }
    }

}
