package generics;

class FloatFoo {
    private Float foo;

    public Float getFoo() {
        return foo;
    }
    public void setFoo(Float foo) {
        this.foo = foo;
    }
}

class StringFoo {
    private String foo;
    public String getFoo() {
        return foo;
    }
    public void setFoo(String foo) {
        this.foo = foo;
    }
}

public class ObjectFoo
{
    private Object foo;

    public Object getFoo()
    {
        return foo;
    }

    public void setFoo(Object foo)
    {
        this.foo = foo;
    }
    
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        ObjectFoo foo1 = new ObjectFoo();
        ObjectFoo foo2 = new ObjectFoo();
        
        foo1.setFoo(new Boolean(false));
        Boolean b = (Boolean)foo1.getFoo();
        
        foo2.setFoo(new Integer(10));
        Integer i = (Integer)foo2.getFoo();
        
        ObjectFoo foo3 = new ObjectFoo();
        foo3.setFoo(new Boolean(false));
        
        String str = (String)foo3.getFoo();
    }
}


