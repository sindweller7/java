package controlflow;

public class Break {
    public static void main(String[] args) {
        System.out.println("--------------------一个简单的for循环,使用break结束--------------------");
        /*
         * break用于完全结束一个循环，跳出循环体。
         * 不管是那种循环，一旦在循环体中遇到break，系统将完全结束该循环，开始执行循环之后的代码。
         */
        for (int i = 0; i < 10; i++) {
            System.out.println("i的值是" + i);
            if (i == 2) {
                // 执行该语句时将结束循环
                break;
            }
        }
        
        System.out.println("---------------------使用break结束外层循环---------------------------");
        //Java中的标签就是一个紧跟着英文冒号(:)的标示符。与其它语言不同的是，Java中的标签只有放在循环语句之前才有作用。
        outer: 
        for (int i = 0; i < 5; i++) {
            //内层循环
            for (int j = 0; j < 5; j++) {
                System.out.println("i的值为:" + i + "  j的值为:" + j);
                if (j == 1) {
                    /*
                    * break语句不仅可以结束其所在的循环，还可以直接结束其外层循环。
                    * 此时需要再brek后紧跟一个标签，这个标签用于标示一个外层循环。
                    */
                    break outer;
                }
            }
            
        }
    }
}