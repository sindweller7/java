package object;

public class InstanceofTest {
    public static void main(String[] args) {
        People people = new People();
        System.out.println(people instanceof People);

        // ���Ϊ true����Ϊ Man�� People�����࣬���ݼ̳У�������Ǹ��࣬��� ManҲ���Կ����� People��ʵ����
        People people2 = new Man();
        System.out.println(people2 instanceof People);
    }
}

class People {

}

class Man extends People {

}
