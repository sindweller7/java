package polymorphism;

/*
 * 静态代码块在类被加载的时候执行，而构造方法是在生成对象的时候执行
 * 类的静态代码块只会执行一次，是在类被加载的时候执行的，因为每个类只会被加载一次，所以静态代码块也只会被执行一次
 */
public class StaticBlock1 {
    public static void main(String[] args) {
        new S();
        new S();
    }
}

class P {
    static {
        System.out.println("P static block");
    }

    public P() {
        System.out.println("P constructor");
    }
}

class Q extends P {
    static {
        System.out.println("Q static block");
    }

    public Q() {
        System.out.println("Q constructor");
    }
}

class S extends Q {
    static {
        System.out.println("S static block");
    }

    public S() {
        System.out.println("S constructor");
    }
}
