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
        // ͨ���޲�������������ConstructorOverload����
        ConstructorOverload oc1 = new ConstructorOverload();
        System.out.println(oc1.name + " " + oc1.count);
        
        // ͨ���в�������������ConstructorOverload����
        ConstructorOverload oc2 = new ConstructorOverload("������Java EE��ҵӦ��ʵս",
                300000);
        System.out.println(oc2.name + " " + oc2.count);
    }
}
