package designpattern;

/*
 * ˼·��1�����������ʱ����Ĺ��췽��һ���ᱻ���á�2������Ĺ��췽���޶�Ϊ˽�е�
 * 3��������new�ķ�ʽ���ɶ���ֻ�ܿ��ǽ�getInstance()��������Ϊ��̬�ģ��෽��
 * 4�����singleton��Ա����Ҳֻ��Ϊstatic����
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

//��Ϊsingleton����ֵ
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

//Ϊsingleton����ֵ,�ڶ��߳������ַ�ʽ��һЩ
class Singleton2 {
    private static Singleton2 singleton2 = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return singleton2;
    }
}


