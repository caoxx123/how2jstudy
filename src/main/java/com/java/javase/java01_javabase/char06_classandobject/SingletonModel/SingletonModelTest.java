package com.java.javase.java01_javabase.char06_classandobject.SingletonModel;

public class SingletonModelTest {
    public static void main(String[] args) {
/*        饿汉式是立即加载的方式，无论是否会用到这个对象，都会加载。
        如果在构造方法里写了性能消耗较大，占时较久的代码，比如建立与数据库的连接，那么就会在启动的时候感觉稍微有些卡顿。

        懒汉式，是延迟加载的方式，只有使用的时候才会加载。 并且有线程安全的考量(鉴于同学们学习的进度，暂时不对线程的章节做展开)。
        使用懒汉式，在启动的时候，会感觉到比饿汉式略快，因为并没有做对象的实例化。 但是在第一次调用的时候，会进行实例化操作，感觉上就略慢。*/

//单例模式的三要素
        //1.构造方法私有化
        //2.创建一个类属性,并根据实际情况决定是否初始化
        //3.写一个方法,返回第二步创建的类属性
        God g1=God.getInstance();
        God g2=God.getInstance();
        God g3=God.getInstance();
        System.out.println(g1.hashCode());
        System.out.println(g2.hashCode());
        System.out.println(g3.hashCode());
        System.out.println(g1.equals(g2)&&g2.equals(g3));
/*        "D:\Program Files\Java\jdk1.8.0_192\bin\java.exe" "-javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2018.3.2\lib\idea_rt.jar=53232:D:\Program Files\JetBrains\IntelliJ IDEA 2018.3.2\bin" -Dfile.encoding=UTF-8 -classpath "D:\Program Files\Java\jdk1.8.0_192\jre\lib\charsets.jar;D:\Program Files\Java\jdk1.8.0_192\jre\lib\deploy.jar;D:\Program Files\Java\jdk1.8.0_192\jre\lib\ext\access-bridge-64.jar;D:\Program Files\Java\jdk1.8.0_192\jre\lib\ext\cldrdata.jar;D:\Program Files\Java\jdk1.8.0_192\jre\lib\ext\dnsns.jar;D:\Program Files\Java\jdk1.8.0_192\jre\lib\ext\jaccess.jar;D:\Program Files\Java\jdk1.8.0_192\jre\lib\ext\jfxrt.jar;D:\Program Files\Java\jdk1.8.0_192\jre\lib\ext\localedata.jar;D:\Program Files\Java\jdk1.8.0_192\jre\lib\ext\nashorn.jar;D:\Program Files\Java\jdk1.8.0_192\jre\lib\ext\sunec.jar;D:\Program Files\Java\jdk1.8.0_192\jre\lib\ext\sunjce_provider.jar;D:\Program Files\Java\jdk1.8.0_192\jre\lib\ext\sunmscapi.jar;D:\Program Files\Java\jdk1.8.0_192\jre\lib\ext\sunpkcs11.jar;D:\Program Files\Java\jdk1.8.0_192\jre\lib\ext\zipfs.jar;D:\Program Files\Java\jdk1.8.0_192\jre\lib\javaws.jar;D:\Program Files\Java\jdk1.8.0_192\jre\lib\jce.jar;D:\Program Files\Java\jdk1.8.0_192\jre\lib\jfr.jar;D:\Program Files\Java\jdk1.8.0_192\jre\lib\jfxswt.jar;D:\Program Files\Java\jdk1.8.0_192\jre\lib\jsse.jar;D:\Program Files\Java\jdk1.8.0_192\jre\lib\management-agent.jar;D:\Program Files\Java\jdk1.8.0_192\jre\lib\plugin.jar;D:\Program Files\Java\jdk1.8.0_192\jre\lib\resources.jar;D:\Program Files\Java\jdk1.8.0_192\jre\lib\rt.jar;D:\how2jstudy\target\classes" com.java.javase.java01_javabase.char06_classandobject.SingletonModel.SingletonModelTest
        460141958
        460141958
        460141958
        true*/
    }
}
