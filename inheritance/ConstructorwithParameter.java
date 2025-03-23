class Rectangle{
    int width;
    int breadth;
    public Rectangle()
    {
        width = breadth = 1;
    }
    public Rectangle(int width,int breadth)
    {
        this.width = width;
        this.breadth = breadth;
    }
}
class Cuboid extends Rectangle{
    int height;
    public Cuboid(){
        height = 1;
    }
    public Cuboid(int height)
    {
        this.height = height;
    }
    public Cuboid(int height,int width, int breadth)
    {
        super(width,breadth);
        this.height = height;
    }
    public int volume()
    {
        return height*breadth*width;
    }
}
public class ConstructorwithParameter {
    public static void main(String[] args)
    {
        Cuboid c = new Cuboid();
        System.out.println(c.volume());
        c = new Cuboid(3);
        System.out.println(c.volume());
        c = new Cuboid(1,2,3);
        System.out.println(c.volume());
    }
}
