package com.java.javase.java01_javabase.char06_array;
//数组反转的实现
public class ArrayRevertTest {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }
        System.out.println("反转之前的数组");
        for (int i = 0; i < intArray.length; i++) {
            if (i == intArray.length - 1) {
                System.out.print(intArray[i]);
            } else {
                System.out.print(intArray[i] + " ,");
            }
        }
        for (int i = 0; i < intArray.length; i++) {
                int j=intArray.length-1-i;
                if (j-i==1||j-1==0){
                    break;
                }else{
                    int temp = 0;
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }

            }
        System.out.println();
        System.out.println("反转之后的结果");
        for (int i = 0; i < intArray.length; i++) {
            if (i == intArray.length - 1) {
                System.out.print(intArray[i]);
            } else {
                System.out.print(intArray[i] + " ,");
            }
        }
        }
}
