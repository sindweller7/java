package encapsulation;

public class ConstructorOverload3 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Constructor co = new Constructor();
    }
}

class Constructor {
    public Constructor() {
        /*
         * �������һ�����췽���е�������һ�����췽������ô����ʹ�� this()�ķ�ʽ���ã� this()�����еĲ���
         * ��ʾĿ�깹�췽���Ĳ����� this()����Ҫ��Ϊ���췽���ĵ�һ����䣬���仰˵�� this()֮ǰ�������κο�ִ�еĴ���
         */
        this(1);
        System.out.println("���ǲ��������Ĺ��췽��");
    }

    public Constructor(int i) {
        System.out.println("i = " + (++i) + " : ���Ǵ������β����Ĺ��췽��");
    }
}
