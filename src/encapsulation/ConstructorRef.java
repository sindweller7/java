package encapsulation;

public class ConstructorRef {
    public String name;
    public String color;
    public double weight;

    public ConstructorRef() {
    }

    public ConstructorRef(String name, String color) {
        this.name = name;
        this.color = color;
    }

    /*
     * 使用this调用另一个重载的构造方法只能在构造方法中使用，而且必须作为构造方法执行体的第一条语句。
     * 使用this调用重载的构造方法时，系统会根据this后括号里的实参来调用形参列表与之对应的构造方法。
     */
    public ConstructorRef(String name, String color, double weight) {
        // 通过this调用另一个重载的构造器的初始化代码
        this(name, color);
        
        // 下面this引用该构造器正在初始化的Java对象
        this.weight = weight;
    }
}
