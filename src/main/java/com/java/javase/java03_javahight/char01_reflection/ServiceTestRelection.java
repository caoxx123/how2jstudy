package com.java.javase.java03_javahight.char01_reflection;

import jdk.nashorn.internal.objects.annotations.Property;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ServiceTestRelection {
    public static void main(String[] args) {
        File file = new File("D:\\how2jstudy\\src\\main\\java\\com\\java\\javase\\java03_javahight\\char01_reflection\\Sping.txt");
        Properties SpringConfig=new Properties();
        try {
            SpringConfig.load(new FileInputStream(file));
            String classname= (String) SpringConfig.get("className");
            String methodName= (String) SpringConfig.get("Method");
            Class clazz=Class.forName(classname);
            Method method=clazz.getMethod(methodName);
            Constructor c=clazz.getConstructor();
            Object service=c.newInstance();
            method.invoke(service);
        } catch (IOException | ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
