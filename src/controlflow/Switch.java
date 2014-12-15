package controlflow;

public class Switch {

    public static void main(String[] args) {
        char score1 ='B';
        /*
         * 与if语句不同的是，switch语句中各case标签后代码块的开始点和结束点都非常清晰，因此完全可以省略case后代码块的花括号。
         */
        switch(score1){
        case 'A':
            System.out.println("优秀");
            break;
        case 'B':
            System.out.println("及格");
            break;
        case 'C':
            System.out.println("不及格");
            break;
        default:
            System.out.println("成绩输入错误");
        }
        
        System.out.println("--------------------没有break的效果-----------------------");
        /*
         * swicth语句会先求出expression表达式的值，然后拿这个值和cast标签后的值比较，一旦遇到相等的值，
         * 程序就开始执行这个case标签后的代码，不再判断与后面case、default标签的条件是否匹配，除非遇到break;才会结束。
         */
        char score2 ='B';
        switch (score2) {
        case 'A':
            System.out.println("优秀");
        case 'B':
            System.out.println("及格");
        case 'C':
            System.out.println("不及格");
        default:
            System.out.println("成绩输入错误");
        }
        
        System.out.println("------------------expression为string类型--------------------");
        String season = "夏天";
        /*
         * Java7增强了switch语句的功能，允许switch语句的控制表达式是java.lang.String类型的变量或表达式--只能是
         * java .lang.String类型，不能是StringBuffer或StringBuilder这两种字符串类型。
         */
        switch (season) {
        case "春天":
            System.out.println("春暖花开.");
            break;
        case "夏天":
            System.out.println("夏日炎炎.");
            break;
        case "秋天":
            System.out.println("秋高气爽.");
            break;
        case "冬天":
            System.out.println("冬雪皑皑.");
            break;
        default:
            System.out.println("季节输入错误");
        }

    }

}
