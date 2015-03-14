package basic;

public class Variable {
    public static void main(String[] args) {
        double a = 1.2;
        System.out.println(a);

        // 这行代码编译出错:Type mismatch: cannot convert from double to float
        // float b = 1.2;
        // System.out.println(b);

        //1)强制类型转换
        float c = (float) 1.2;
        System.out.println(c);

        //2)使用 java语言的支持，大小写F均可以
        float d = 1.2F;
        System.out.println(d);
    }
}
