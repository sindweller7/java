package polymorphism;
/*
 * ��ʹ�ö�̬��ʽ���÷���ʱ�����ȼ�鸸�����Ƿ���sing()���������û��������������У���ȥ���������sing()������
 */
public class PolyTest1 {
    public static void main(String[] args) {
        // Parent parent = new Parent();
        // parent.sing();

        // Child child = new Child();
        // child.sing();

        /*
         * 1��ע�������sing()��������̳и����sing����
         * 2����ע�������sing()����������д�����sing����
         * 3��ע�͵������sing()����,��������
         */
        Parent p = new Child();
        p.sing();
    }
}

class Parent {
    public void sing() {
        System.out.println("parent is singing");
    }
}

class Child extends Parent {
    public void sing() {
        System.out.println("child is singing");
    }
}