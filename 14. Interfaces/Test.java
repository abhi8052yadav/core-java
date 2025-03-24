interface Test1{
   void meth1();
   void meth2();
}
class My implements Test1{
    public void meth1()
    {
        System.out.println("it is the my class");
    }
    public void meth2()
    {
        System.out.println("it is the my class meth2");
    }
}
public class Test{
    public static void main(String[] args)
    {
        Test1 t = new My();
        t.meth1();
        t.meth2();
    }
}