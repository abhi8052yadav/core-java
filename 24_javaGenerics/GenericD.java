
@SuppressWarnings("unchecked")
public class GenericD<T> {
    T data[] = (T[]) new Object[10];
    int length = 0;
    public void append(T v)
    {
        data[length++] = v;
    }
    public void display()
    {
        for(int i=0; i<length; i++)
        {
            System.out.println(data[i]);
        }
    }
    public static void main(String[] args) {
        GenericD<Integer> i = new GenericD<>();
        i.append(0);
        i.append(1);
        i.append(2);
        i.display();
    }
}
