package basic;

public class Calc {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = a / b;
        //�˴���ӡ0��С���������ݱ�������
        System.out.println(c);
        
        int d = 1;
        int e = 2;
        //�˴�Ҫʹ��ǿ������ת����������ӡ0.0
        float f = (float)d / e;
        //�˴���ӡ0.5
        System.out.println(f);
    }
}
