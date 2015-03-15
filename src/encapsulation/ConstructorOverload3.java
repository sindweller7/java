package encapsulation;

public class ConstructorOverload3 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Constructor co = new Constructor();
    }
}

class Constructor {
    public Constructor() {
        /*
         * 如果想在一个构造方法中调用另外一个构造方法，那么可以使用 this()的方式调用， this()括号中的参数
         * 表示目标构造方法的参数。 this()必须要作为构造方法的第一条语句，换句话说， this()之前不能有任何可执行的代码
         */
        this(1);
        System.out.println("这是不带参数的构造方法");
    }

    public Constructor(int i) {
        System.out.println("i = " + (++i) + " : 这是传入整形参数的构造方法");
    }
}
