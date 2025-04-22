class My<T extends Number>{
    T v;
}

public class BoundedType {
    public static void main(String[] args) {
        My<Integer> m = new My<>();
        m.v = 5;
        System.out.println(m.v);
    }
}
