package basic;

public class Variable {
    public static void main(String[] args) {
        double a = 1.2;
        System.out.println(a);

        // ���д���������:Type mismatch: cannot convert from double to float
        // float b = 1.2;
        // System.out.println(b);

        //1)ǿ������ת��
        float c = (float) 1.2;
        System.out.println(c);

        //2)ʹ�� java���Ե�֧�֣���СдF������
        float d = 1.2F;
        System.out.println(d);
    }
}
