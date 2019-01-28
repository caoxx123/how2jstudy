package com.java.javase.java01_javabase.char08_digitandstring;
//该类用于将String转换为对应的基本类型
public class StringCastTest {
    public static void main(String[] args) {
        float f=3.14f;
        String s=String.valueOf(f);
        System.out.println(s);
        float f1=Float.parseFloat(s);
        System.out.println(f1);
        System.out.println(f==f1);
    }
}
