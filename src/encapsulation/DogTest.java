package encapsulation;

/*public class DogTest {
    public static void main(String[] args) {
        Dog dog2 = new Dog();
        dog2.run();
        dog2.jump();
    }
}*/

public class DogTest
{
    int a;
    public static void info()
    {
        System.out.println("�򵥵�info����");
    }
    public void main(String[] args) 
    {
        //��Ϊmain�����Ǿ�̬��������info�ǷǾ�̬������
        //����main�������Ǹ��౾�������Ǹ����ʵ����
        //���ʡ�Ե�this�޷�ָ����Ч�Ķ���
        info();
        int a;
        System.out.println(this.a);
//        System.out.println(a);
    }
}