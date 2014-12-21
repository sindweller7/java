package array;


public class ArrayInRam {

    /*
     * 实际的数组对象被存储在堆(heap)内存中;如果引用该数组对象的数组引用变量是一个局部变量，
     * 那没它被存储在栈(stack)内存中。
     */
    public static void main(String[] args) {
        int[] a = {5, 7, 20};
        int[] b = new int[4];
        System.out.println("the length of array b is : " + b.length);
        for(int i = 0; i< a.length; i++){
            /*
             * 如果要访问堆内存中的数组元素，则程序中只能通过a[index]的形式实现。
             * 也就是说，数组引用变量是访问堆内存中数组的根本方式。
             */
            System.out.println("a[" + i + "] = " + a[i]);
        }
        
        for(int i = 0; i< b.length; i++){
            System.out.println("b[" + i + "] = " + b[i]);
        }
        
        /*
         * 如果堆内存中的数组不再有任何引用变量指向自己，则这个数组将成为垃圾，
         * 该数组所占的内存将会被系统的垃圾回收及时回收。
         */
        b = a;
        /*
         * 看起来数组b的长度变为了3，这只是一个假象。必须牢记：定义并初始化了一个数组后，
         * 在内存中分配了两个空间，一个用于存放数组的引用变量，另一个用于存放数组本身。
         */
        System.out.println("the length of array b is : " + b.length);
    }

}
