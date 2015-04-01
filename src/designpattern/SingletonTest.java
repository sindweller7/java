package designpattern;

/*
 * 思路：1、在生成类的时候，类的构造方法一定会被调用。2、将类的构造方法限定为私有的
 * 3、不能用new的方式生成对象，只能考虑将getInstance()方法设置为静态的，类方法
 * 4、因此singleton成员变量也只能为static的了
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton == singleton2);
        
        Singleton2 singleton3 = Singleton2.getInstance();
        Singleton2 singleton4 = Singleton2.getInstance();
        System.out.println(singleton3 == singleton4);
    }
}

//不为singleton赋初值
class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }
}

//为singleton赋初值,在多线程下这种方式好一些
class Singleton2 {
    private static Singleton2 singleton2 = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return singleton2;
    }
}


