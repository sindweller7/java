package encapsulation;

public class ConstructorRef {
    public String name;
    public String color;
    public double weight;

    public ConstructorRef() {
    }

    public ConstructorRef(String name, String color) {
        this.name = name;
        this.color = color;
    }

    /*
     * ʹ��this������һ�����صĹ��췽��ֻ���ڹ��췽����ʹ�ã����ұ�����Ϊ���췽��ִ����ĵ�һ����䡣
     * ʹ��this�������صĹ��췽��ʱ��ϵͳ�����this���������ʵ���������β��б���֮��Ӧ�Ĺ��췽����
     */
    public ConstructorRef(String name, String color, double weight) {
        // ͨ��this������һ�����صĹ������ĳ�ʼ������
        this(name, color);
        
        // ����this���øù��������ڳ�ʼ����Java����
        this.weight = weight;
    }
}
