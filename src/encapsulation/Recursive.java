package encapsulation;

/*
 * 一个方法体内调用它自身，被称为方法递归。方法递归包含了一种隐式的循环，他会重复执行某段代码，但这种重复执行无须循环控制。
 * 已知一个数列：f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n),其中n是大于0的整数，求f(10)的值。
 * 已知一个数列：f(20)=1,f(21)=4,f(n+2)=2*f(n+1)+f(n),其中n是大于0的整数，求f(10)的值。
 */
public class Recursive {
    public static int fn(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            //递归一定要向已知方向递归
            return 2 * fn(n - 1) + fn(n - 2);
        }
    }
    
    public static int fn1(int n) {
        if (n == 20) {
            return 1;
        } else if (n == 21) {
            return 4;
        } else {
            //递归一定要向已知方向递归
            return fn1(n + 2) - 2 * fn1(n + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fn(10));
        System.out.println(fn1(10));
    }

}
