package array;

/*
 * 主要介绍数组的定义、初始化、取值
 */
public class Array {
    public static void main(String[] args) {
        /*
         *1、定义数组*
         * 定义一个数组有两种语法格式，通常使用第一种格式。 定义数组时，不能指定数组的长度
         */
        // 语意：定义一个变量，其变量名是 obj1
        @SuppressWarnings("unused")
        Object[] obj1;
        /*
         * 这种方式不好，好像是定义了一个String类型的变量，其变量名是str1[] 与真实含义想去甚远，不要这样用。
         */
        @SuppressWarnings("unused")
        String str1[];

        /*
         * 2、初始化数组
         * 静态初始化：初始化时由程序员显式的指定每个数组元素的初始值，由系统决定数组长度。
         * 动态初始化：初始化时程序员只指定数组长度，由系统为数组元素分配初始值。
         */
        //静态初始化
        Object[] obj2 = new String[] {"你好！", "12345","hello world!"};
        //更常用的初始化数组方法
        int[] int1 = {1, 2, 3, 4, 5};
        
        /*
         * 3、使用数组
         * java语言的数组索引从0开始
         * 如果访问数组元素时指定的索引值小于0，或者大于等于数组的长度，编译程序不会出现错误，但运行
         * 时会异常
         */
        for (int i = 0; i < int1.length; i++){
            System.out.println("int[" + i + "]的值为：" + i);
        }
        
        /*
         * foreach循环自动遍历数组和集合的每个元素
         * 使用foreach循环迭代数组元素时，并不能改变数组元素的值，因此不要对foreach的循环变量进行赋值
         */
        for(Object o : obj2){
            System.out.println((String)o);
        }
    }

}
