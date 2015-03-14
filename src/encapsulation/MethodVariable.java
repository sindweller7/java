package encapsulation;

public class MethodVariable {

    public static void main(String[] args) {
        int a;
        // The local variable a may not have been initialized
        // System.out.println(a);
        a = 1;
        System.out.println("代码块局部变量a的值： " + a);
    }

}
