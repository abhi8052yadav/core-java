abstract class Super{
    public Super(){}
    abstract public void meth1();
}
class Sub extends Super{
    @Override
    public void meth1()
    {
        System.out.println("subclass meth1");
    }
}

public class AbstractClass {
    public static void main(String[] args)
    {
        Super s = new Sub();
        s.meth1();
    }
}
