package inheritance;

/*
 * 当生成子类对象时，Java默认首先调用父类的不带参数的构造方法，然后执行该构造方法，生成父类的对象。
 * 接下来，再去调用子类的构造方法，生成子类的对象。
 * 【要想生成子类的对象，首先需要生成父类的对象，没有父类对象就没有子类对象。比如说：没有父亲，就没有孩子】。
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
