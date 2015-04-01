package polymorphism;

public class StaticMethod1 {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        //调用静态方法，注意m2.staticOutput()输出的是staticM
        M m1 = new M();
        m1.staticOutput();
        
        M m2 = new N();
        m2.staticOutput();
        
        N n1 = new N();
        n1.staticOutput();
        
        //调用非静态方法，注意m2.staticOutput()输出的是N
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
    //静态方法只能继承，不能冲重写。这里加上Override标签后，会报编译错误。
    public static void staticOutput() {
        System.out.println("staticN");
    }
    
    public void output() {
        System.out.println("N");
    }
}
