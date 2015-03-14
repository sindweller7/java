package basic;

public class Calc {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = a / b;
        //此处打印0，小数点后的内容被舍弃了
        System.out.println(c);
        
        int d = 1;
        int e = 2;
        //此处要使用强制类型转换，否则会打印0.0
        float f = (float)d / e;
        //此处打印0.5
        System.out.println(f);
    }
}
