import java.lang.reflect.Field;
import java.lang.reflect.Method;

import sun.applet.Main;

public class ReflectTester {
    public static void main(String[] args){
        Class<?> clazz = Customer.class;
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields){
            System.out.println(field);
        }
    }

}

class Customer {
    private Long id;

    private String name;

    private int age;

    public Customer() {

    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
