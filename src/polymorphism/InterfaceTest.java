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

//Java �ǵ��̳еģ�Ҳ����˵ĳ����ֻ����Ψһһ�����ࣻһ�������ʵ�ֶ���ӿڣ�����ӿ�֮��ʹ�ö��ŷָ���
class MyClass extends MyParent implements MyInterface, MyInterface2 {
    public void output() {
        System.out.println("output");
    }

    public void output2() {
        System.out.println("output2");
    }
}
