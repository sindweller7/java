package polymorphism;

public class InterfaceTest {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.output();
        myClass.output2();
        myClass.output3();
    }
}

interface MyInterface {
    public void output();
}

interface MyInterface2 {
    public void output2();
}

class MyParent {
    public void output3() {
        System.out.println("output3");
    }
}

//Java 是单继承的，也就是说某个类只能有唯一一个父类；一个类可以实现多个接口，多个接口之间使用逗号分隔。
class MyClass extends MyParent implements MyInterface, MyInterface2 {
    public void output() {
        System.out.println("output");
    }

    public void output2() {
        System.out.println("output2");
    }
}
