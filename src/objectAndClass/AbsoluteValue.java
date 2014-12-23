package objectAndClass;

/*
 * 方法重载三大原则：
 * 1、方法名相同
 * 2、参数不同，可以有三方面的不同：数量不同、类型不同、顺序不同
 * 3、同一作用域
 */
/* 比较麻烦的方法*/
//public class AbsoluteValue {
//    /* 求整数绝对值的方法 */
//    public int absOfInt(int x) {
//        return ((x >= 0) ? x : -x);
//    }
//
//    /* 求浮点数绝对值的方法 */
//    public float absOfFloat(float x) {
//        return ((x >= 0) ? x : -x);
//    }
//
//    public static void main(String[] args) {
//        AbsoluteValue obj = new AbsoluteValue();
//        int a = -8, b;
//        b = obj.absOfInt(a);
//        System.out.println(a + "的绝对值是" + b);
//
//        float c = -3.14f, d;
//        d = obj.absOfFloat(c);
//        System.out.println(c + "的绝对值是" + d);
//    }
//}

/* 由以上代码可见，如果还要求其它类型数据的绝对值，就需要定义更多的方法.
 * 这对于调用者来说，将会是非常麻烦的事情。可以使用构造方法对代码进行改进： */
public class AbsoluteValue {
    /* 求整数绝对值的方法 */
    public int abs(int x) {
        return ((x >= 0) ? x : -x);
    }

    /* 求浮点数绝对值的方法 */
    public float abs(float x) {
        return ((x >= 0) ? x : -x);
    }

    public static void main(String[] args) {
        AbsoluteValue obj = new AbsoluteValue();
        
        int a = -8, b;
        b = obj.abs(a);
        System.out.println(a + " 的绝对值是 " + b);

        float c = -3.14f, d;
        d = obj.abs(c);
        System.out.println(c + " 的绝对值是 " + d);
    }
}

/* 方法重载跟方法的返回值类型没有任何关系。也就是说，只有返回值不同的方法不能构成重载。
 * 以下代码将会编译错误 */
//class AbsoluteValue
//{
//      /*求整数绝对值的方法*/
//      public int abs(int x)
//      {
//        return ((x >= 0) ? x : -x);
//      } 
//      /*打印整数绝对值的方法*/
//      public void abs(int x)
//      {
//          System.out.println(x);
//      }
//}
