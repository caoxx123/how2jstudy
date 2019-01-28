package com.java.javase.java01_javabase.char06_array;

//学习arraycopy方法的使用
public class CopyArrayTest {
    public static void main(String[] args) {
    int [] array={1,2,3};
    int [] goalarray=new int [10];
        //参数的作用,第一个参数是源数组,第二个参数是要复制的原始数组的开始位置
        //第三个参数是目标数组,第四个参数是复制到到目标数组的长度,第五个参数
        //是从源数组到目标数组复制多长
        System.arraycopy(array,0,goalarray,0,3);
        for (int number: goalarray) {
            System.out.println(number);
        }
    }
}
