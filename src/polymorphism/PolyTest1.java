package polymorphism;
/*
 * 当使用多态方式调用方法时，首先检查父类中是否有sing()方法，如果没有则编译错误；如果有，再去调用子类的sing()方法。
 */
public class PolyTest1 {
    public static void main(String[] args) {
        // Parent parent = new Parent();
        // parent.sing();

        // Child child = new Child();
        // child.sing();

        /*
         * 1、注释子类的sing()方法，则继承父类的sing方法
         * 2、不注释子类的sing()方法，则重写父类的sing方法
         * 3、注释掉父类的sing()方法,则编译出错
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