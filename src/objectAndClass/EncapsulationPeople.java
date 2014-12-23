package objectAndClass;

class People {
    // 将Field使用private修饰，将这些Field隐藏起来
    private String name;
    private int age;

    // 提供方法来操作name Field
    public void setName(String name) {
        // 执行合理性校验，要求用户名必须在2～6位之间
        if (name.length() > 6 || name.length() < 2) {
            System.out.println("您设置的人名不符合要求");
            return;
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }

    // 提供方法来操作age Field
    public void setAge(int age) {
        // 执行合理性校验，要求用户年龄必须在0～100之间
        if (age > 100 || age < 0) {
            System.out.println("您设置的年龄不合法");
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
         * main方法不能直接修改People对象的name和age两个Field，因此程序员可以在setter方法中增加
         * 自己的控制逻辑，从而保证name和age两个Field不会出现与实际不符的情形。
         */
        // 因为age Field已被隐藏，所以下面语句将出现编译错误。
        // p.age = 1000;

        p.setAge(1000);
        System.out.println("未能设置age Field时：" + p.getAge());
        
        p.setAge(30);
        System.out.println("成功设置age Field后：" + p.getAge());

        p.setName("李刚");
        System.out.println("成功设置name Field后：" + p.getName());
    }
}
