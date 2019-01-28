package com.java.javase.java02_javamiddle.char09_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestSocket {
    public static void main(String[] args) {
        try {
            //java 启动tomcat
//            Process p=Runtime.getRuntime().exec("cmd /c startup");
            Process p = Runtime.getRuntime().exec("ping " + "192.168.2.106");
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                if (line.length() != 0)
                    sb.append(line + "\r\n");
            }
            System.out.println("本次指令返回的消息是：");
            System.out.println(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
