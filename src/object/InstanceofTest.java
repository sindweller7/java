package object;

public class InstanceofTest {
    public static void main(String[] args) {
        People people = new People();
        System.out.println(people instanceof People);

        // 结果为 true，因为 Man是 People的子类，根据继承，子类就是父类，因此 Man也可以看作是 People的实例。
        People people2 = new Man();
        System.out.println(people2 instanceof People);
    }
}

class People {

}

class Man extends People {

}
