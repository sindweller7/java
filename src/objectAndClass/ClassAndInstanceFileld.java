package objectAndClass;

class Person {
    // 定义一个实例Field
    public String name;
    // 定义一个类Field
    public static int eyeNum;
}

public class ClassAndInstanceFileld {
    @SuppressWarnings("static-access")
    /*
     * 1、成员变量无需显示初始化，只要为一个类定义了Field货实例Field， 系统就会在这个类 的准备阶段或穿件该类的实例时进行默认初始化。
     * 2、java运行通过实例访问static修饰的Field本身就是一个错误，这里也使用了SuppressWarnings
     */
    public static void main(String[] args) {
        // Person类已经初始化了，则eyeNum变量起作用了，输出0
        System.out.println("Person的eyeNum类Field值:" + Person.eyeNum);

        Person p = new Person();
        System.out.println("p变量的name Field值是：" + p.name
                + " p对象的eyeNum Field值是：" + p.eyeNum);

        p.name = "孙悟空";
        p.eyeNum = 2;
        System.out.println("p变量的name Field值是：" + p.name
                + " p对象的eyeNum Field值是：" + p.eyeNum);
        System.out.println("Person的eyeNum类Field值是:" + Person.eyeNum);

        Person p2 = new Person();
        System.out.println("p2对象的eyeNum类Field值:" + p2.eyeNum);
    }
}
