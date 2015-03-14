package encapsulation;

/*
 * һ���������ڵ�������������Ϊ�����ݹ顣�����ݹ������һ����ʽ��ѭ���������ظ�ִ��ĳ�δ��룬�������ظ�ִ������ѭ�����ơ�
 * ��֪һ�����У�f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n),����n�Ǵ���0����������f(10)��ֵ��
 * ��֪һ�����У�f(20)=1,f(21)=4,f(n+2)=2*f(n+1)+f(n),����n�Ǵ���0����������f(10)��ֵ��
 */
public class Recursive {
    public static int fn(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            //�ݹ�һ��Ҫ����֪����ݹ�
            return 2 * fn(n - 1) + fn(n - 2);
        }
    }
    
    public static int fn1(int n) {
        if (n == 20) {
            return 1;
        } else if (n == 21) {
            return 4;
        } else {
            //�ݹ�һ��Ҫ����֪����ݹ�
            return fn1(n + 2) - 2 * fn1(n + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fn(10));
        System.out.println(fn1(10));
    }

}
