package com.java.javase.java02_javamiddle.char07_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloJDBC {
    public static void main(String[] args) {
        Connection c=null;
        Statement statement=null;
        try {
            //Class.forName是把这个类加载到JVM中，加载的时候，就会执行其中的静态初始化块，完成驱动的初始化的相关工作。
            Class.forName("com.mysql.jdbc.Driver");

            // 建立与数据库的Connection连接
            // 这里需要提供：
            // 数据库所处于的ip:127.0.0.1 (本机)
            // 数据库的端口号： 3306 （mysql专用端口号）
            // 数据库名称 how2java
            // 编码方式 UTF-8
            // 账号 root
            // 密码 root
            //Conection
            String url="jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8";
            String username="root";
            String password="root";
             c= DriverManager.getConnection(url,username,password);
            //Statement是用于执行SQL语句的，比如增加，删除
             statement=c.createStatement();
            //s.execute执行sql语句
            // 准备sql语句
            // 注意： 字符串要用单引号'
            String sql = "insert into hero values(null,"+"'提莫'"+","+313.0f+","+50+")";
            statement.execute(sql);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(c!=null){
                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
