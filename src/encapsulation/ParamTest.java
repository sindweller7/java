package encapsulation;

public class ParamTest {
    public static void main(String[] args) {
        Person2 person = new Person2();
        //���ݵ�Ҳ��ֵ��ֻ�������ݵ������õ�ֵ
        person.change(person);
        int age = person.age;
        System.out.println(age);
        System.out.println("--------------------------");

        int i = 10;
        //���ݵ���ֵ
        person.change2(i);
        System.out.println(i);
    }
}

class Person2 {
    int age = 20;

    public void change(Person2 person) {
        person = new Person2();
        person.age = 30;
    }

    public void change2(int age) {
        age = 40;
    }
}