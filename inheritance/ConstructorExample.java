class Parent{
    public Parent()
    {
        System.out.println("the parent constructor is called");
    }
}
class Child extends Parent{
    public Child()
    {
        System.out.println("the child constructor is called ");
    }
}
public class ConstructorExample {
    public static void main(String[] args)
    {
        Child c = new Child();
        System.out.println(c);
    }
}
