// 2. Static Methods:
// Write a Java program to create a class called "MathUtility" with a static method add that takes two integers and returns their sum. Demonstrate the usage of this static method in the main method without creating an instance of "MathUtility".

class MathUtility{
    public static int add(int a,int b)
    {
        return a+b;
    }
}
public class MathU {
    public static void main(String[] args) {
        System.out.println(MathUtility.add(1,2));
    }
}
