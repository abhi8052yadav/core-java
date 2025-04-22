
@SuppressWarnings("unchecked")
public class GenericDemo<T>{
    T data[] =(T[]) new Object[3];
    public static void main(String[] args)
    {
        GenericDemo<String> st = new GenericDemo<>();
        st.data[0] = "hi";
        st.data[1] = "bye";
        st.data[2] = "Abhishek";
        System.out.println(st.data[0]);
    }
}

//to run the code run it manually by following command
// javac -d . NoParameterGenericDemo.java
// java NoParameterGenericDemo


// import java.util.ArrayList;
// import java.util.List;

// public class GenericDemo<T> {
//     List<T> data = new ArrayList<>();

//     public static void main(String[] args) {
//         GenericDemo<String> st = new GenericDemo<>();
//         st.data.add("hi");
//         st.data.add("bye");
//         st.data.add("Abhishek");

//         String str = st.data.get(0); // No cast needed
//         System.out.println(str);
//     }
// }
