package polymorphism;

public class PolyTest2 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Dog dog1 = (Dog) a1;
        dog1.sing();

        Animal a2 = new Cat();
        Cat cat = (Cat) a2;
        cat.sing();

        //这里不会有编译错误，但是事实上会执行失败.实际指向的是谁，即可用转换为什么类型的引用。
        //不能强制的将猫转换为狗
        Dog dog2 = (Dog)a2;
        dog2.sing();
        
        /*******************另一个例子******************************/
        Animal animal = new Cat();
        Animal animal2 = new Animal();

        //正确，Animal类型的应用可以相互指向
        animal2 = animal;
        animal2.sing();
        
        //正确，Animal类型的应用可以相互指向
        animal2 = new Animal();
        animal = animal2;
        animal.sing();

        //正确，父类型的引用可以指向子类的对象。
        Cat cat2 = new Cat();
        Animal animal3 = cat2;
        animal3.sing();
        
        //这里不会有编译错误，但是事实上会执行失败.不能强制的将动物转换为猫。
        Animal animal4 = new Animal();
        Cat cat4 = (Cat)animal4;
        cat4.sing();
    }
}

class Animal {
    public void sing() {
        System.out.println("animal is singing");
    }
}

class Dog extends Animal {
    public void sing() {
        System.out.println("dog is singing");
    }
}

class Cat extends Animal {
    public void sing() {
        System.out.println("cat is singing");
    }
}
