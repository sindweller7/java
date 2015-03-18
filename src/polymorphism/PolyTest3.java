package polymorphism;

public class PolyTest3 {
    public static void main(String[] args) {
        // 下面的代码会出现编译错误，The method grow() is undefined for the type Fruit
        // Fruit fruit = new Pear();
        // fruit.grow();

        // 什么时候需要使用强制类型转换？想要使用子类所特有的方法时
        Fruit fruit = new Pear();
        Pear pear = (Pear) fruit;
        pear.grow();

    }
}

class Fruit {
    public void run() {
        System.out.println("fruit is running");
    }
}

class Pear extends Fruit {
    public void run() {
        System.out.println("pear is running");
    }

    public void grow() {
        System.out.println("pear is growing");
    }
}