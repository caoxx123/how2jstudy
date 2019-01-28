package com.java.javase.java01_javabase.char08_digitandstring;

public class IntToIntegerandIntegerToINtTest {
    public static void main(String[] args) {
        //所谓的装箱即就是让基本类型转换为对应的包装类,拆箱即就是让包装类转换为基本类型
        //赋值运算符=后面的即就是该基本类型的字面量
        byte b=1;
        short s=1;
        int i=1;
        long l=10l;
        float f=1;
        double d=2;
        char c='a';
        boolean b1=true;

        Byte B=b;
        Short S=s;
        Integer I=i;
        Long L=l;
        Float F=f;
        Double D=d;
        Character C=c;
        Boolean B1=b1;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
