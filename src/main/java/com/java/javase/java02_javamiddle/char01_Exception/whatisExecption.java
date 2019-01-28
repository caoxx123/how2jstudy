package com.java.javase.java02_javamiddle.char01_Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class whatisExecption {
    /*
    *
    *
    *
    * 不管是否发生异常finally代码块中的代码都会执行
    * 多异常执行的几种办法
    * 1、多个catch分别捕获异常
    * 2、在catch中使用|| 写明
    * throws与throw这两个关键字接近，不过意义不一样，有如下区别：
1. throws 出现在方法声明上，而throw通常都出现在方法体内。
2. throws 表示出现异常的一种可能性，并不一定会发生这些异常；throw则是抛出了异常，执行throw则一定抛出了某个异常对象
    *
    *异常分类： 可查异常，运行时异常和错误3种
其中，运行时异常和错误又叫非可查异常
运行时异常RuntimeException指： 不是必须进行try catch的异常

可查异常即必须进行处理的异常，要么try catch住,要么往外抛，谁调用，谁处理，比如 FileNotFoundException
常见运行时异常:
除数不能为0异常:ArithmeticException
下标越界异常:ArrayIndexOutOfBoundsException
空指针异常:NullPointerException
错误Error，指的是系统级别的异常，通常是内存用光了
在默认设置下，一般java程序启动的时候，最大可以使用16m的内存
如例不停的给StringBuffer追加字符，很快就把内存使用光了。抛出OutOfMemoryError
与运行时异常一样，错误也是不要求强制捕捉的
    *
    *
    *
    *
    * */
    public static void main(String[] args) {
        File f=new File("d:/LOL.exe");
        try {
            //试图打开该文件的时候,文件可能不存在,所以会抛出异常
            new FileInputStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
