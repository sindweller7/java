package inheritance;

/*
 * �������������ʱ��JavaĬ�����ȵ��ø���Ĳ��������Ĺ��췽����Ȼ��ִ�иù��췽�������ɸ���Ķ���
 * ����������ȥ��������Ĺ��췽������������Ķ���
 * ��Ҫ����������Ķ���������Ҫ���ɸ���Ķ���û�и�������û��������󡣱���˵��û�и��ף���û�к��ӡ���
 */

public class Child extends Parent {
    public Child() {
        System.out.println("child");
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Child child = new Child();
    }
}

class Parent {
    public Parent() {
        System.out.println("no args parent");
    }
}

//public class Child extends Parent {
//    public Child() {
//        System.out.println("child");
//    }
//
//    @SuppressWarnings("unused")
//    public static void main(String[] args) {
//        Child child = new Child();
//    }
//}
//
//class Parent {
//    public Parent(int i) {
//        System.out.println("parent");
//    }
//}
