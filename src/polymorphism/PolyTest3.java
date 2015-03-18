package polymorphism;

public class PolyTest3 {
    public static void main(String[] args) {
        // ����Ĵ������ֱ������The method grow() is undefined for the type Fruit
        // Fruit fruit = new Pear();
        // fruit.grow();

        // ʲôʱ����Ҫʹ��ǿ������ת������Ҫʹ�����������еķ���ʱ
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