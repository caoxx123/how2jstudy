package com.java.javase.java01_javabase.char06_array;
//foreach的方式查找数组中的最大值
public class ForeachfindMaxTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3232, 333, 22};
        int max=0;
        for (int number : array) {
            if(number>max){
                max=number;
            }
        }
        System.out.println(max);
    }
}
