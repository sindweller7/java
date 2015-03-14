package basic;

public class LogicTest {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;

        // 逻辑与测试，可更改括号内的值进行测试
        boolean f = (a > b) && (c < d);
        System.out.println("f = " + f);

        // 逻辑或测试，可更改括号内的值进行测试
        boolean g = (a > b) || (c > d);
        System.out.println("g = " + g);

        // 逻辑与短路测试
        boolean h = (a < b) && ((e = a) < b);
        System.out.println("e = " + e);
        System.out.println("h = " + h);

        // 逻辑或短路测试
        boolean i = (a < b) || ((e = a) < b);
        System.out.println("e = " + e);
        System.out.println("i = " + i);
    }
}