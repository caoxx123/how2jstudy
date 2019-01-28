package com.java.javase.java02_javamiddle.char02_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class StreamTest {
    public static void main(String[] args) {
        File f = new File("d:/lol.txt");
        // 创建基于文件的输入流
        try {
            // 通过这个输入流，就可以把数据从硬盘，读取到Java的虚拟机中来，也就是读取到内存中
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            // 通过这个输出流，就可以把数据从内存，输出到硬盘的文件上
            FileOutputStream fos = new FileOutputStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
