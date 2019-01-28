package com.java.javase.java02_javamiddle.char02_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* InputStream字节输入流
OutputStream字节输出流
用于以字节的形式读取和写入数据
*
* */
public class ByteStreamTest {
    public static void main(String[] args) {
        try {
//            InputStream是字节输入流，同时也是抽象类，只提供方法声明，不提供方法的具体实现。
//            FileInputStream 是InputStream子类，以FileInputStream 为例进行文件读取
            //准备文件lol.txt其中的内容是AB，对应的ASCII分别是65 66
            File f =new File("d:/lol.txt");
            //创建基于文件的输入流
            FileInputStream fis =new FileInputStream(f);
            //创建字节数组，其长度就是文件的长度
            byte[] all =new byte[(int) f.length()];
            //以字节流的形式读取文件所有内容
            fis.read(all);
            for (byte b : all) {
                //打印出来是65 66
                System.out.println(b);
            }

            //每次使用完流，都应该进行关闭
            fis.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
//        OutputStream是字节输出流，同时也是抽象类，只提供方法声明，不提供方法的具体实现。
//        FileOutputStream 是OutputStream子类，以FileOutputStream 为例向文件写出数据
        try {
            // 准备文件lol2.txt其中的内容是空的
            File f = new File("d:/lol.txt");
            // 准备长度是2的字节数组，用88,89初始化，其对应的字符分别是X,Y
            byte data[] = { 88, 89 };

            // 创建基于文件的输出流
            FileOutputStream fos = new FileOutputStream(f);
            // 把数据写入到输出流
            fos.write(data);
            // 关闭输出流
            fos.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        /*
        *             File f = new File("d:/xyz/abc/def/lol2.txt");

            //因为默认情况下，文件系统中不存在 d:\xyz\abc\def，所以输出会失败

            //首先获取文件所在的目录
            File dir = f.getParentFile();
            //如果该目录不存在，则创建该目录
            if(!dir.exists()){
//              dir.mkdir(); //使用mkdir会抛出异常，因为该目录的父目录也不存在
                dir.mkdirs(); //使用mkdirs则会把不存在的目录都创建好
            }

            byte data[] = { 88, 89 };

            FileOutputStream fos = new FileOutputStream(f);

            fos.write(data);

            fos.close();*/
    }
}
