class TryCatchAndThrows{
    public int area(int a, int b) throws Exception{
        if(a < 0 || b<0)
        {
            throw new Exception("length or breadth must a positive value");
        }
        return a*b;
    }
    public void findarea()
    {
       try {
        int a = area(10,-10);
        System.out.println(a);
       } catch (Exception e) {
         System.out.println(e);
       }
    }
}

public class TryCatch{
    public static void main(String[] args)
    {
        TryCatchAndThrows n = new TryCatchAndThrows();
        n.findarea();
    }
}