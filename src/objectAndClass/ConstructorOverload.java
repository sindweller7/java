package objectAndClass;

public class ConstructorOverload {
    public String name;
    public int count;

    public ConstructorOverload() {
    }

    public ConstructorOverload(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public static void main(String[] args) {
        // 通过无参数构造器创建ConstructorOverload对象
        ConstructorOverload oc1 = new ConstructorOverload();
        System.out.println(oc1.name + " " + oc1.count);
        
        // 通过有参数构造器创建ConstructorOverload对象
        ConstructorOverload oc2 = new ConstructorOverload("轻量级Java EE企业应用实战",
                300000);
        System.out.println(oc2.name + " " + oc2.count);
    }
}
