package controlflow;

public class If {

    /*
     * java中提供了两种常见的分支结构：if语句和switch语句，其中if语句使用布尔表达式或者布尔值
     * 作为分支条件来进行分支控制；而switch语句则用于对多个整型值进行匹配，从而实现分支控制。
     */
    public static void main(String[] args) {
        int age = 45;
        System.out.println("----------------错误的if逻辑---------------");
        // 这段代码会导致打印結果是青年人，期望值为中年人
        // if判断只会进入一个分支，所以本程序不会打印 青年人 中年人
        if (age > 20) {
            System.out.println("青年人");
        } else if (age > 40) {
            System.out.println("中年人");
        } else if (age > 60) {
            System.out.println("老年人");
        }

        System.out.println("----------------正确的的if逻辑---------------");
        /*
         * 总是优先把包含范围小的条件放在前面处理。如age>60和age>20两个条件，明显age>60的
         * 范围更小，所以应该优先处理age>60的情况。
         */
        if (age > 60) {
            System.out.println("老年人");
        } else if (age > 40) {
            System.out.println("中年人");
        } else if (age > 20) {
            System.out.println("青年人");
        }

        System.out.println("----------------通常的if逻辑---------------");
        /*
         * 上面的逻辑不是很好理解，通常会分区间做每个if条件判断
         */
        if (age > 60) {
            System.out.println("老年人");
        } else if (age > 40 && age <= 60) {
            System.out.println("中年人");
        } else if (age > 20 && age <= 40) {
            System.out.println("青年人");
        } else {
            System.out.println("小屁孩");
        }
    }

}
