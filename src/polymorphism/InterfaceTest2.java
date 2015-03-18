package polymorphism;

public class InterfaceTest2 {
    public static void main(String[] args) {
        //接口多态
        AA bb = new BB();
        bb.output();

        //也可以这样写，向上类型转换
         BB bb2 = new BB();
         AA aa1 = bb2;
         aa1.output();

        //还可以这样写，向下类型转换
         AA aa3 = new BB();
         BB bb3 = (BB)aa3;
         bb3.output();
    }
}

interface AA {
    public void output();
}

class BB implements AA {
    public void output() {
        System.out.println("BB");
    }
}
