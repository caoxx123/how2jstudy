package com.java.javase.java02_javamiddle.char02_io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SystemInTest {
    public static void main(String[] args) {
//        System.out 是常用的在控制台输出数据的
//        System.in 可以从控制台输入数据
// 接受客户输入
        Scanner s = new Scanner(System.in);
        System.out.println("请输入类的名称：");
        String className = s.nextLine();
        System.out.println("请输入属性的类型：");
        String type = s.nextLine();
        System.out.println("请输入属性的名称：");
        String property = s.nextLine();
        String Uproperty = toUpperFirstLetter(property);

        // 读取模版文件
        File modelFile = new File("E:\\project\\j2se\\src\\Model.txt");
        String modelContent = null;
        try (FileReader fr = new FileReader(modelFile)) {
            char cs[] = new char[(int) modelFile.length()];
            fr.read(cs);
            modelContent = new String(cs);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //替换

        String fileContent = modelContent.replaceAll("@class@", className);
        fileContent = fileContent.replaceAll("@type@", type);
        fileContent = fileContent.replaceAll("@property@", property);
        fileContent = fileContent.replaceAll("@Uproperty@", Uproperty);
        String fileName = className+".java";

        //替换后的内容
        System.out.println("替换后的内容：");
        System.out.println(fileContent);
        File file = new File("E:\\project\\j2se\\src",fileName);

        try(FileWriter fw =new FileWriter(file);){
            fw.write(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("文件保存在:" + file.getAbsolutePath());
    }
    public static String toUpperFirstLetter(String str){
        char upperCaseFirst =Character.toUpperCase(str.charAt(0));
        String rest = str.substring(1);
        return upperCaseFirst + rest;

    }
}
