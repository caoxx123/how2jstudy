package com.java.javase.java02_javamiddle.char09_network.Socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args)  {

        try {
            //连接到本机的8888端口
            Socket s = new Socket("127.0.0.1",8888);
            System.out.println(s);
            // 打开输出流
            OutputStream os = s.getOutputStream();

            // 发送数字110到服务端
            os.write(110);
            os.close();
            s.close();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
