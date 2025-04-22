class My<T>
{
    T v;
}
class Child extends My<Integer>{

}
public class SubClassDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.v = 4;
        System.out.println(c.v);
    }
}
