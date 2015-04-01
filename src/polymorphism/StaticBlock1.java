package polymorphism;

/*
 * ��̬��������౻���ص�ʱ��ִ�У������췽���������ɶ����ʱ��ִ��
 * ��ľ�̬�����ֻ��ִ��һ�Σ������౻���ص�ʱ��ִ�еģ���Ϊÿ����ֻ�ᱻ����һ�Σ����Ծ�̬�����Ҳֻ�ᱻִ��һ��
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
