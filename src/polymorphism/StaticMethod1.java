package polymorphism;

public class StaticMethod1 {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        //���þ�̬������ע��m2.staticOutput()�������staticM
        M m1 = new M();
        m1.staticOutput();
        
        M m2 = new N();
        m2.staticOutput();
        
        N n1 = new N();
        n1.staticOutput();
        
        //���÷Ǿ�̬������ע��m2.staticOutput()�������N
        M m3 = new M();
        m3.output();
        
        M m4 = new N();
        m4.output();
        
        N n2 = new N();
        n2.output();
    }
}

class M {
    public static void staticOutput() {
        System.out.println("staticM");
    }
    
    public void output() {
        System.out.println("M");
    }
}

class N extends M {
    //��̬����ֻ�ܼ̳У����ܳ���д���������Override��ǩ�󣬻ᱨ�������
    public static void staticOutput() {
        System.out.println("staticN");
    }
    
    public void output() {
        System.out.println("N");
    }
}
