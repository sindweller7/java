package inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Apple apple = new Apple();
        //1�������еģ�����Ҳ��,���Խ�String name = "apple";ע�͵�
        //2������û�еģ�����������ӣ����Խ�String name = "fruit";ע�͵�
        //3�������еģ�������Ըı䣬����name���Ծ���ע��
        System.out.println(apple.name);
    }
}

class Fruit {
    String name = "fruit";
}

class Apple extends Fruit {
    String name = "apple";
}
