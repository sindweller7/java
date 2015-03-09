package generics;

public class GenericFoo<T> {
    private T foo;
    public T getFoo() {
        return foo;
    }
    public void setFoo(T foo) {
        this.foo = foo;
    }
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        GenericFoo<Boolean> foo1 = new GenericFoo<Boolean>();
        GenericFoo<Integer> foo2 = new GenericFoo<Integer>();

        foo1.setFoo(new Boolean(false));
        foo2.setFoo(new Integer(3));

        Boolean b = foo1.getFoo();
        Integer i = foo2.getFoo();

        System.out.println(b);
        System.out.println(i);
        
        //取消注释后会出错，foo1和foo2的类型应经定义好了
        //foo1 = foo2;
        
        //同样，在实例化对象时，也可以不指定类型，但是这样就需要进行强制类型转换了
        GenericFoo a = new GenericFoo();
        
        a.setFoo("hello");
        
        String str = (String)a.getFoo();
        
        System.out.println(str);
    }
}
