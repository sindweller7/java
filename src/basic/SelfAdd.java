package basic;

public class SelfAdd {

    public static void main(String[] args) {
        int a = 3;
        int b = a++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        int c = 3;
        int d = ++c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
