class SuperClass{
    public void display()
    {
        System.out.println("Hello ! ");
    }
}
class Subclass extends SuperClass{
    @Override
    public void display(){
        System.out.println("hello welcome");
    }
}
public class OverridingConcept {
    public static void main(String[] args)
    {
        SuperClass sub = new SuperClass();
        sub.display();
        Subclass s = new Subclass();
        s.display();
        SuperClass sb = new Subclass();
        sb.display();
    }
}
