package objectAndClass;

public class Varargs {
    /*
     * 长度可变的形参只能处于形参列表的最后，一个方法中最多只能包含一个长度可变的形参。
     * 调用包含一个长度可变形参的方法时，这个长度可变的形参既可以传入多个参数，也可以传入一个数组。
     */
    public static void test(int a, String... books) {
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        //传入多个参数
        test(5, "疯狂java讲义", "轻量级 java EE企业应用实战");
        
        //传入一个数组
        String[] books = {"hello", "crazy java", "good"};
        test(5, books);
    }
}
