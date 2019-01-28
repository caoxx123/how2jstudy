package com.java.javase.java02_javamiddle.char09_network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalMachineTest {
    public static void main(String[] args) {
        InetAddress host;
        {
            try {
                host = InetAddress.getLocalHost();
                String ip=host.getHostAddress();
                System.out.println(ip);
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
        }
    }

}
