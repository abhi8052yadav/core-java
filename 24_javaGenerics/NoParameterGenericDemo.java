
class GenericDemo<T>{
    T v;
    public void set(T v)
    {
        this.v = v;
    }
}

public class NoParameterGenericDemo {
    public static void main(String[] args) {
        GenericDemo a = new GenericDemo<>();
        a.v = 5;
        System.out.println(a.v);
    }
}


//to run the code run it manually by following command
// javac -d . NoParameterGenericDemo.java
// java NoParameterGenericDemo
