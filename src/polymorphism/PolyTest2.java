package polymorphism;

public class PolyTest2 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Dog dog1 = (Dog) a1;
        dog1.sing();

        Animal a2 = new Cat();
        Cat cat = (Cat) a2;
        cat.sing();

        //���ﲻ���б�����󣬵�����ʵ�ϻ�ִ��ʧ��.ʵ��ָ�����˭��������ת��Ϊʲô���͵����á�
        //����ǿ�ƵĽ�èת��Ϊ��
        Dog dog2 = (Dog)a2;
        dog2.sing();
        
        /*******************��һ������******************************/
        Animal animal = new Cat();
        Animal animal2 = new Animal();

        //��ȷ��Animal���͵�Ӧ�ÿ����໥ָ��
        animal2 = animal;
        animal2.sing();
        
        //��ȷ��Animal���͵�Ӧ�ÿ����໥ָ��
        animal2 = new Animal();
        animal = animal2;
        animal.sing();

        //��ȷ�������͵����ÿ���ָ������Ķ���
        Cat cat2 = new Cat();
        Animal animal3 = cat2;
        animal3.sing();
        
        //���ﲻ���б�����󣬵�����ʵ�ϻ�ִ��ʧ��.����ǿ�ƵĽ�����ת��Ϊè��
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
