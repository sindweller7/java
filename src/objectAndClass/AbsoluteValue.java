package objectAndClass;

/*
 * ������������ԭ��
 * 1����������ͬ
 * 2��������ͬ��������������Ĳ�ͬ��������ͬ�����Ͳ�ͬ��˳��ͬ
 * 3��ͬһ������
 */
/* �Ƚ��鷳�ķ���*/
//public class AbsoluteValue {
//    /* ����������ֵ�ķ��� */
//    public int absOfInt(int x) {
//        return ((x >= 0) ? x : -x);
//    }
//
//    /* �󸡵�������ֵ�ķ��� */
//    public float absOfFloat(float x) {
//        return ((x >= 0) ? x : -x);
//    }
//
//    public static void main(String[] args) {
//        AbsoluteValue obj = new AbsoluteValue();
//        int a = -8, b;
//        b = obj.absOfInt(a);
//        System.out.println(a + "�ľ���ֵ��" + b);
//
//        float c = -3.14f, d;
//        d = obj.absOfFloat(c);
//        System.out.println(c + "�ľ���ֵ��" + d);
//    }
//}

/* �����ϴ���ɼ��������Ҫ�������������ݵľ���ֵ������Ҫ�������ķ���.
 * ����ڵ�������˵�������Ƿǳ��鷳�����顣����ʹ�ù��췽���Դ�����иĽ��� */
public class AbsoluteValue {
    /* ����������ֵ�ķ��� */
    public int abs(int x) {
        return ((x >= 0) ? x : -x);
    }

    /* �󸡵�������ֵ�ķ��� */
    public float abs(float x) {
        return ((x >= 0) ? x : -x);
    }

    public static void main(String[] args) {
        AbsoluteValue obj = new AbsoluteValue();
        
        int a = -8, b;
        b = obj.abs(a);
        System.out.println(a + " �ľ���ֵ�� " + b);

        float c = -3.14f, d;
        d = obj.abs(c);
        System.out.println(c + " �ľ���ֵ�� " + d);
    }
}

/* �������ظ������ķ���ֵ����û���κι�ϵ��Ҳ����˵��ֻ�з���ֵ��ͬ�ķ������ܹ������ء�
 * ���´��뽫�������� */
//class AbsoluteValue
//{
//      /*����������ֵ�ķ���*/
//      public int abs(int x)
//      {
//        return ((x >= 0) ? x : -x);
//      } 
//      /*��ӡ��������ֵ�ķ���*/
//      public void abs(int x)
//      {
//          System.out.println(x);
//      }
//}
