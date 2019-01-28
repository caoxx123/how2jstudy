package com.java.javase.java02_javamiddle.char07_JDBC.ConnectionPool;;

import java.util.ArrayList;
import java.util.List;

//向数据库中插入100条数据，比较传统方式和数据库连接池方式的性能差异
// 1. 使用传统方式创建100个线程，每个线程都会创建新的连接，通过这个连接向数据库插入1条数据，然后关闭这个连接。
//2. 使用数据库连接池的方式，创建一个有10条连接的连接池，然后创建100个线程，每个线程都会向连接池借用连接，借用到后
// ，向数据库插入1条数据，然后归还这个连接。
//
//  通过时间统计，比较这两种方式的性能表现差异。
public class TestConnectionPool {
    private  static int threadNumber = 100;
    public static int insertTime = 1;

    public static void main(String[] args) {
        traditionalWay();
        connectionPoolWay();
    }

    private static void connectionPoolWay() {
        ConnectionPool cp = new ConnectionPool(10);

        System.out.println("开始连接池方式插入数据测试：");
        long start = System.currentTimeMillis();
        List<Thread> ts = new ArrayList<>();
        for (int i = 0; i < threadNumber; i++) {
            Thread t =new ConnectionpoolWorkingThread(cp);
            t.start();
            ts.add(t);
        }
        //等待所有线程结束
        for (Thread t : ts) {
            try {
                t.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        long end = System.currentTimeMillis();

        System.out.printf("使用连接池方式，启动%d条线程，每个线程插入%d条数据，一共耗时%d 毫秒%n",threadNumber,insertTime,end-start);

    }

    private static void traditionalWay() {
        System.out.println("开始传统方式插入数据测试：");
        long start = System.currentTimeMillis();
        List<Thread> ts = new ArrayList<>();
        for (int i = 0; i < threadNumber; i++) {
            Thread t =new TraditionalWorkingThread();
            t.start();
            ts.add(t);
        }
        //等待所有线程结束
        for (Thread t : ts) {
            try {
                t.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        long end = System.currentTimeMillis();

        System.out.printf("使用传统方式，启动%d条线程，每个线程插入%d条数据，一共耗时%d 毫秒%n",threadNumber,insertTime,end-start);

    }
}

