package encapsulation;

/*public class DogTest {
    public static void main(String[] args) {
        Dog dog2 = new Dog();
        dog2.run();
        dog2.jump();
    }
}*/

public class DogTest
{
    int a;
    public static void info()
    {
        System.out.println("简单的info方法");
    }
    public void main(String[] args) 
    {
        //因为main方法是静态方法，而info是非静态方法，
        //调用main方法的是该类本身，而不是该类的实例，
        //因此省略的this无法指向有效的对象
        info();
        int a;
        System.out.println(this.a);
//        System.out.println(a);
    }
}