package array;


public class ArrayInRam {

    /*
     * ʵ�ʵ�������󱻴洢�ڶ�(heap)�ڴ���;������ø����������������ñ�����һ���ֲ�������
     * ��û�����洢��ջ(stack)�ڴ��С�
     */
    public static void main(String[] args) {
        int[] a = {5, 7, 20};
        int[] b = new int[4];
        System.out.println("the length of array b is : " + b.length);
        for(int i = 0; i< a.length; i++){
            /*
             * ���Ҫ���ʶ��ڴ��е�����Ԫ�أ��������ֻ��ͨ��a[index]����ʽʵ�֡�
             * Ҳ����˵���������ñ����Ƿ��ʶ��ڴ�������ĸ�����ʽ��
             */
            System.out.println("a[" + i + "] = " + a[i]);
        }
        
        for(int i = 0; i< b.length; i++){
            System.out.println("b[" + i + "] = " + b[i]);
        }
        
        /*
         * ������ڴ��е����鲻�����κ����ñ���ָ���Լ�����������齫��Ϊ������
         * ��������ռ���ڴ潫�ᱻϵͳ���������ռ�ʱ���ա�
         */
        b = a;
        /*
         * ����������b�ĳ��ȱ�Ϊ��3����ֻ��һ�����󡣱����μǣ����岢��ʼ����һ�������
         * ���ڴ��з����������ռ䣬һ�����ڴ����������ñ�������һ�����ڴ�����鱾��
         */
        System.out.println("the length of array b is : " + b.length);
    }

}
