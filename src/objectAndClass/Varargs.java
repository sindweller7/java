package objectAndClass;

public class Varargs {
    /*
     * ���ȿɱ���β�ֻ�ܴ����β��б�����һ�����������ֻ�ܰ���һ�����ȿɱ���βΡ�
     * ���ð���һ�����ȿɱ��βεķ���ʱ��������ȿɱ���βμȿ��Դ�����������Ҳ���Դ���һ�����顣
     */
    public static void test(int a, String... books) {
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        //����������
        test(5, "���java����", "������ java EE��ҵӦ��ʵս");
        
        //����һ������
        String[] books = {"hello", "crazy java", "good"};
        test(5, books);
    }
}
