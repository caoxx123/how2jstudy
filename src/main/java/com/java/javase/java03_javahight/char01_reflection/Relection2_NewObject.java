package com.java.javase.java03_javahight.char01_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Relection2_NewObject {
    public static void main(String[] args) {
//        getField和getDeclaredField的区别
//                这两个方法都是用于获取字段
//        getField 只能获取public的，包括从父类继承来的字段。
//        getDeclaredField 可以获取本类所有的字段，包括private的，但是不能获取继承来的字段。
//        (注： 这里只能获取到private的字段，但并不能访问该private字段的值,除非加上setAccessible(true))
        //// 获取这个名字叫做setName，参数类型是String的方法
        //            Method m = h.getClass().getMethod("setName", String.class);
        //            // 对h对象，调用这个方法
        //            m.invoke(h, "盖伦");
        //首先获取Relection0_Hero类的类对象
        Class Hero=Relection0_Hero.class;
        try {
            Constructor constructor=Hero.getConstructor();
            try {
                Relection0_Hero hero= (Relection0_Hero) constructor.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
