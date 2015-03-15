package encapsulation;

public class ParamTest {
    public static void main(String[] args) {
        Person2 person = new Person2();
        // 传递的也是值，只不过传递的是引用的值，所以age的值改变了
        person.change(person);
        int age = person.age;
        System.out.println(age);
        System.out.println("--------------------------");

        int i = 10;
        // 传递的是值，所以打印值是i
        person.change2(i);
        System.out.println(i);
    }
}

class Person2 {
    int age = 20;

    public void change(Person2 person) {
        //画图分析，注释这句话的区别
        // person = new Person2();
        person.age = 30;
    }

    public void change2(int age) {
        age = 40;
    }
}
