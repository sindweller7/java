package encapsulation;

public class ConstructorOverload2 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Play play1 = new Play();
        Play play2 = new Play("С��");
        Play play3 = new Play("С��", "С��");
        Play play4 = new Play("С��", "С��", "Сǿ");
    }
}

class Play {
    public Play() {
        System.out.println("û������");
    }

    public Play(String name) {
        System.out.println(name + "����������־11");
    }

    public Play(String name, String name1) {
        System.out.println(name + "��" + name1 + "����������");
    }

    public Play(String name, String name1, String name2) {
        System.out.println(name + "��" + name1 + "��" + name2 + "�����涷����");
    }
}
