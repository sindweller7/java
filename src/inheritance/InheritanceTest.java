package inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Apple apple = new Apple();
        //1、父类有的，子类也有,可以将String name = "apple";注释掉
        //2、父类没有的，子类可以增加，可以将String name = "fruit";注释掉
        //3、父类有的，子类可以改变，两个name属性均不注释
        System.out.println(apple.name);
    }
}

class Fruit {
    String name = "fruit";
}

class Apple extends Fruit {
    String name = "apple";
}
