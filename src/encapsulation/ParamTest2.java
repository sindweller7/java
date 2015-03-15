package encapsulation;

public class ParamTest2 {
    public void change(Person3 person, Person3 person2) {
        person.name = "lisi";
        person2.name = "wangwu";
    }

    public static void main(String[] args) {
        Person3 person = new Person3();
        person.name = "zhangsan";

        Person3 person2 = person;
        // Person3 person2 = new Person();

        ParamTest2 test = new ParamTest2();
        test.change(person, person2);

        System.out.println(person.name);
    }
}

class Person3 {
    String name;
}
