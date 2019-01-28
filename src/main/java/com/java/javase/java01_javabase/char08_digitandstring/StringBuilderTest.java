package com.java.javase.java01_javabase.char08_digitandstring;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder();
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.capacity());
        stringBuilder.append("111111111");
        System.out.println(stringBuilder);
        stringBuilder.append("aaaaaaa");
        System.out.println(stringBuilder);
        stringBuilder.insert(1,"abbb");
        System.out.println(stringBuilder);
        stringBuilder.delete(1,4);
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.length());
    }
}
