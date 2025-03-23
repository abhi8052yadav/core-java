import java.util.*;

public class ClassExample {
        double radius;

        public ClassExample(double radius)
        {
            this.radius = radius;
        }
        public double area(double radius)
        {
            return (Math.PI)*radius*radius;
        }
        public double perimeter(double radius){
            return 2*(Math.PI)*radius;
        }
}
class MainClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        double n = sc.nextInt();
        ClassExample c = new ClassExample(n);
        System.out.println("the area of the circle is : "+c.area(n));
        System.out.println("the perimeter of the circle is "+c.perimeter(n));
        sc.close();
    }
}
