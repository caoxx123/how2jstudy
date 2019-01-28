package com.java.javase.java01_javabase.char06_array;
//选择排序跟冒泡排序的实现
public class TwoArraySortTest {
    public static void main(String[] args) {
        int[] array = {120, 23, 45, 121, 54};
        System.out.println("排序之前的数组");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ",");
            }
        }
        //方法一:选择排序
        //思路:
//        把第一位和其他所有的进行比较，只要比第一位小的，就换到第一个位置来
//        比较完后，第一位就是最小的
//        然后再从第二位和剩余的其他所有进行比较，只要比第二位小，就换到第二个位置来
//        比较完后，第二位就是第二小的
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = 0;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                } else {
//                    continue;
                }
            }
        }
        System.out.println();
        System.out.println("排序之后的数组");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ",");
            }
        }
        System.out.println();
        //方法二:冒泡排序
        //思路:
//        第一步：从第一位开始，把相邻两位进行比较
//        如果发现前面的比后面的大，就把大的数据交换在后面，循环比较完毕后，最后一位就是最大的
//        第二步： 再来一次，只不过不用比较最后一位
        int[] array2 = {120, 23, 45, 121, 54, 88};
        System.out.println("排序之前的数组");
        for (int i = 0; i < array2.length; i++) {
            if (i == array2.length - 1) {
                System.out.print(array2[i]);
            } else {
                System.out.print(array2[i] + ",");
            }
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = i; j < array2.length - 1; j++) {
                if (array2[i] > array2[i + 1]) {
                    int temp;
                    temp = array2[j];
                    array2[j] = array2[j + 1];
                    array2[j + 1] = temp;
                } else {
                    continue;
                }
            }
        }
        System.out.println();
        System.out.println("排序之后的数组");
        for (int i = 0; i < array2.length; i++) {
            if (i == array2.length - 1) {
                System.out.print(array2[i]);
            } else {
                System.out.print(array2[i] + ",");
            }
        }
    }

}
