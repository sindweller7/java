package encapsulation;

/*
 * �������������ڶ����ϵġ�һ��������Ա����������ָ�򣬵�ͬһʱ�̣�ÿ������ֻ��ָ��Ψһ��һ������
 * ���һ�����󱻶��������ָ����ô�����ĸ����öԶ�������Խ������޸ģ����ᷴӳ�����������õ��С�
 */
public class PeopleReferenceType {
    int age = 20;

    // PeopleReferenceType���û�����ģ��ڶ�������֮��Ϳ���ʹ����
    public void changeAge(PeopleReferenceType people) {
        //��Ҫ���������new���ע�ͺ󣬽���ǲ�һ����
        people = new PeopleReferenceType();
        people.age = 30;
    }

    public static void main(String[] args) {
        PeopleReferenceType people = new PeopleReferenceType();
        int age1 = people.age;
        System.out.println("age1 = " + age1);

        //��java�����޷��������󣬶���ͨ����������Ӳ��ݵ�
        people.changeAge(people);
        int age2 = people.age;
        System.out.println("age2 = " + age2);
    }
}
