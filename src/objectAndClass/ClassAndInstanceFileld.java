package objectAndClass;

class Person {
    // ����һ��ʵ��Field
    public String name;
    // ����һ����Field
    public static int eyeNum;
}

public class ClassAndInstanceFileld {
    @SuppressWarnings("static-access")
    /*
     * 1����Ա����������ʾ��ʼ����ֻҪΪһ���ඨ����Field��ʵ��Field�� ϵͳ�ͻ�������� ��׼���׶λ򴩼������ʵ��ʱ����Ĭ�ϳ�ʼ����
     * 2��java����ͨ��ʵ������static���ε�Field�������һ����������Ҳʹ����SuppressWarnings
     */
    public static void main(String[] args) {
        // Person���Ѿ���ʼ���ˣ���eyeNum�����������ˣ����0
        System.out.println("Person��eyeNum��Fieldֵ:" + Person.eyeNum);

        Person p = new Person();
        System.out.println("p������name Fieldֵ�ǣ�" + p.name
                + " p�����eyeNum Fieldֵ�ǣ�" + p.eyeNum);

        p.name = "�����";
        p.eyeNum = 2;
        System.out.println("p������name Fieldֵ�ǣ�" + p.name
                + " p�����eyeNum Fieldֵ�ǣ�" + p.eyeNum);
        System.out.println("Person��eyeNum��Fieldֵ��:" + Person.eyeNum);

        Person p2 = new Person();
        System.out.println("p2�����eyeNum��Fieldֵ:" + p2.eyeNum);
    }
}
