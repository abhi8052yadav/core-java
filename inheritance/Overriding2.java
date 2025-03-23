class Television{
    public void switchOn(){System.out.println("tv is on.");}
    public void switchOf(){System.out.println("tv is of now.");}
}
class SmartTV extends Television{
    @Override
    public void switchOn(){System.out.println("smart TV is on");}
    @Override
    public void switchOf(){System.out.println("smart TV is of ");}
    public void browser(){System.out.println("you are browsing");}
}
public class Overriding2 {
    public static void main(String[] args)
    {
        Television t1 = new Television();
    
        t1.switchOn();
        t1.switchOf();

        SmartTV t2 = new SmartTV();

        t2.switchOn();
        t2.switchOf();
        t2.browser();
        
        Television t3 = new SmartTV();
        t3.switchOf();
        t3.switchOn();
        // t3.browser(); here as you can see if you remove the comment then it will show an error.
        //hence you can access only those methods which are the part of superclass.if you are using to hold subclass object throuch superclass
        //reference.
    }

}
