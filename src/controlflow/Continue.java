package controlflow;

/*
 * continue 的功能和 break 类似，区别是continue只终止本次循环，接着开始下一次循环，而
 * break则是完全终止循环本身。
 */
public class Continue {

    public static void main(String[] args) {
        System.out.println("--------------一个简单的for循环,使用continue结束被本次循环--------------");
        for(int i = 0; i <= 10; i++){
            System.out.println("*****i的第" + i + "次循环*****");
            if(i % 2 == 0){
                //i为偶数时，本次循环剩下的语句不会被执行
                continue;
            }
            System.out.println("continue后输出的语句，i = " + i);
        }
        
        System.out.println("--------------一个简单的for循环,使用continue结束被本次循环--------------");
        outer:
        /*
         * 运行本程序可以看到，j的值将无法超过1，因为每当j等于1时，continue outer语句就结束了外层循环的当次循环，直接开始
         * 下一次循环，内存循环没有机会执行完成。
         */
        for(int i = 0; i < 5; i++){
            System.out.println("*****i的第" + i + "次循环*****");
            for(int j = 0; j < 3; j++){
                System.out.println("i = " + i + "; j = " + j);
                if(j == 1){
                    //j为1时，结束outer外层循环的当次循环，开始下一次循环
                    continue outer;
                }
            }
        }

    }

}
