package basic;

public class LogicTest {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;

        // �߼�����ԣ��ɸ��������ڵ�ֵ���в���
        boolean f = (a > b) && (c < d);
        System.out.println("f = " + f);

        // �߼�����ԣ��ɸ��������ڵ�ֵ���в���
        boolean g = (a > b) || (c > d);
        System.out.println("g = " + g);

        // �߼����·����
        boolean h = (a < b) && ((e = a) < b);
        System.out.println("e = " + e);
        System.out.println("h = " + h);

        // �߼����·����
        boolean i = (a < b) || ((e = a) < b);
        System.out.println("e = " + e);
        System.out.println("i = " + i);
    }
}