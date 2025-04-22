class HashMapExample<T,K>{
    T v;
    K k;
    public void set(T v,K k)
    {
        this.v = v;
        this.k = k;
    }
}

public class MultipleParameter {
    public static void main(String[] args) {
        HashMapExample<Integer,String> st = new HashMapExample<>();
        st.v = 1;
        st.k = "abhishek";

        System.out.println(st.v+","+st.k);
    }
}
