import java.util.*;

public class Cylinder {
    double radius;
    double height;
    
    public Cylinder(double radius, double height)
    {
        this.radius = radius;
        this.height = height;
    }
    public double lidArea()
    {
        return 2*((Math.PI)*radius*radius);
    }
    public double volume()
    {
        return (Math.PI)*radius*height;
    }
}
class MainClass{    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of the cylinder : ");
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        Cylinder cl = new Cylinder(radius,height);
        System.out.println("the lidArea of the cylinder is : "+cl.lidArea());
        System.out.println("the volume of the cylinder is : "+cl.volume());
        sc.close();
    }
}
