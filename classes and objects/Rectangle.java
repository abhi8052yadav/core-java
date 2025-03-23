import java.util.*;

public class Rectangle {
    double length; 
    double breadth;

    public Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    public double area(double length,double breadth)
    {
        return length*breadth;
    }
    public double circumference(double length,double breadth)
    {
        return 2*(length + breadth);
    }
}
class MainClass{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the rectangle : ");
        double length = sc.nextDouble();
        System.out.println("enter the breadth of the rectangle : ");
        double breadth = sc.nextDouble();
        Rectangle r1 = new Rectangle(length,breadth);
        System.out.println("the area of the rectangle is : "+r1.area(length,breadth));
        System.out.println("the area of the rectangle is : "+r1.circumference(length,breadth));
        sc.close();
    }
}
