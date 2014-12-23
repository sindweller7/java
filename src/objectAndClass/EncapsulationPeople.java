package objectAndClass;

class People {
    // ��Fieldʹ��private���Σ�����ЩField��������
    private String name;
    private int age;

    // �ṩ����������name Field
    public void setName(String name) {
        // ִ�к�����У�飬Ҫ���û���������2��6λ֮��
        if (name.length() > 6 || name.length() < 2) {
            System.out.println("�����õ�����������Ҫ��");
            return;
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }

    // �ṩ����������age Field
    public void setAge(int age) {
        // ִ�к�����У�飬Ҫ���û����������0��100֮��
        if (age > 100 || age < 0) {
            System.out.println("�����õ����䲻�Ϸ�");
            return;
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }
}

public class EncapsulationPeople {
    public static void main(String[] args) {
        People p = new People();
        /*
         * main��������ֱ���޸�People�����name��age����Field����˳���Ա������setter����������
         * �Լ��Ŀ����߼����Ӷ���֤name��age����Field���������ʵ�ʲ��������Ρ�
         */
        // ��Ϊage Field�ѱ����أ�����������佫���ֱ������
        // p.age = 1000;

        p.setAge(1000);
        System.out.println("δ������age Fieldʱ��" + p.getAge());
        
        p.setAge(30);
        System.out.println("�ɹ�����age Field��" + p.getAge());

        p.setName("���");
        System.out.println("�ɹ�����name Field��" + p.getName());
    }
}
