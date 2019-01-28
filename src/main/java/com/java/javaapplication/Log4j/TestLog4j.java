package com.java.javaapplication.Log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLog4j {
    //1. 基于类的名称获取日志对象
    static Logger logger=Logger.getLogger(TestLog4j.class);

    public static void main(String[] args) {
     //2. 进行默认配置
//        BasicConfigurator.configure();
//        PropertyConfigurator.configure("D:\\how2jstudy\\src\\main\\java\\com\\java\\javaapplication\\Log4j\\log4j.properties");
        PropertyConfigurator.configure("D:\\how2jstudy\\src\\main\\java\\com\\java\\javaapplication\\Log4j\\log4j.xml");
     // 3. 设置日志输出级别
//        logger.setLevel(Level.DEBUG);
//        logger.trace("跟踪信息");
//        logger.debug("调试信息");
//        logger.info("输出消息");
////        try {
////            Thread.sleep(1000);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//        logger.warn("警告信息");
//        logger.error("错误信息");
//        logger.fatal("致命信息");
        for (int i = 0; i < 50000; i++) {
            logger.trace("跟踪信息");
            logger.debug("调试信息");
            logger.info("输出消息");
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
            logger.warn("警告信息");
            logger.error("错误信息");
            logger.fatal("致命信息");
        }
    }
}
