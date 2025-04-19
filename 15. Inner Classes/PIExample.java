// 4. Static Final Variables
// Write a Java program to create a class called Constants with a static final variable 'PI' initialized to 3.14159. Create a method to calculate the area of a circle given its radius, using the 'PI' constant. Demonstrate the method in the main method.

class Constants{
    static final float PI = 3.14159f;
    public static void areaOfCircle(int r)
    {
       System.out.println("area of the circle is : "+PI*r*r);
    }
}

public class PIExample {
    public static void main(String[] args) {
        Constants.areaOfCircle(3);
    }
}
