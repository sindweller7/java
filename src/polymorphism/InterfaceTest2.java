package polymorphism;

public class InterfaceTest2 {
    public static void main(String[] args) {
        //�ӿڶ�̬
        AA bb = new BB();
        bb.output();

        //Ҳ��������д����������ת��
         BB bb2 = new BB();
         AA aa1 = bb2;
         aa1.output();

        //����������д����������ת��
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
