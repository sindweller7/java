package encapsulation;

/*
 * 引用类型是用在对象上的。一个对象可以被多个引用所指向，但同一时刻，每个引用只能指向唯一的一个对象。
 * 如果一个对象被多个引用所指向，那么无论哪个引用对对象的属性进行了修改，都会反映到其他的引用当中。
 */
public class PeopleReferenceType {
    int age = 20;

    // PeopleReferenceType是用户定义的，在定义完了之后就可以使用了
    public void changeAge(PeopleReferenceType people) {
        //重要，把下面的new语句注释后，结果是不一样的
        people = new PeopleReferenceType();
        people.age = 30;
    }

    public static void main(String[] args) {
        PeopleReferenceType people = new PeopleReferenceType();
        int age1 = people.age;
        System.out.println("age1 = " + age1);

        //在java里面无法操作对象，都是通过引用来间接操纵的
        people.changeAge(people);
        int age2 = people.age;
        System.out.println("age2 = " + age2);
    }
}
