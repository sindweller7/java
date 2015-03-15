package encapsulation;

public class ConstructorOverload2 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Play play1 = new Play();
        Play play2 = new Play("小明");
        Play play3 = new Play("小明", "小军");
        Play play4 = new Play("小明", "小军", "小强");
    }
}

class Play {
    public Play() {
        System.out.println("没有人玩");
    }

    public Play(String name) {
        System.out.println(name + "可以玩三国志11");
    }

    public Play(String name, String name1) {
        System.out.println(name + "和" + name1 + "可以玩象棋");
    }

    public Play(String name, String name1, String name2) {
        System.out.println(name + "、" + name1 + "和" + name2 + "可以玩斗地主");
    }
}
