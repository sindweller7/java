package polymorphism;

/*
 *晚绑定的例子，只有程序运行时才知道A的类型
 */
public class PolyTest4 {
    public static void main(String[] args) {
        A a = null;

        if (args[0].equals("1")) {
            a = new B();
        } else if (args[0].equals("2")) {
            a = new C();
        } else if (args[0].equals("3")) {
            a = new D();
        }

        a.method();
    }
}

class A {
    public void method() {
        System.out.println("A");
    }
}

class B extends A {
    public void method() {
        System.out.println("B");
    }
}

class C extends A {
    public void method() {
        System.out.println("C");
    }
}

class D extends A {
    public void method() {
        System.out.println("D");
    }
}