class Outer {
    int x = 10;   // Outer class variable

    public void LocalExample() {
        // Local Inner Class defined inside a method
        class InnerLocal {
            public void innerClass() {
                System.out.println(x + " this is the value of outer class");
            }
        }
        // Creating an instance of the local inner class
        InnerLocal n = new InnerLocal();
        n.innerClass();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.LocalExample();   // Accessing the local inner class through the outer class method
    }
}
