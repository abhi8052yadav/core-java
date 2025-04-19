class Outer{
    int x = 10;
    int y = 20;
    class Inner{
        int z = 30;
        public void innerDisplay(){
            System.out.println(x+"\n"+y+"\n"+z);
        }
    }
    public void outerDisplay()
    {
        Inner i = new Inner();
        System.out.println(x+"\n"+y+"\n"+i.z);
    }
}

public class NestedInnerClass{
   public static void main(String[] args)
   {
        Outer o = new Outer();
        o.outerDisplay();
        Outer.Inner oi = new Outer().new Inner();
        oi.innerDisplay();
   }

}