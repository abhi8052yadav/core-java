public class CircleCylinder{
     class Circle{
          int radius;
          public double area()
          {
               System.out.println(Math.PI*radius*radius);
               return Math.PI*radius*radius;
          }
     }
     class Cylinder extends Circle{
          int height;
          public void volume()
          {
               System.out.println(height*area());
          }
     }
     class Main{
          public static void main(String[] args) {
               CircleCylinder c = new CircleCylinder();
               Cylinder r = c.new Cylinder();
               r.radius = 5;
               r.height = 10;
               r.area();
               r.volume();
          }
     }
}