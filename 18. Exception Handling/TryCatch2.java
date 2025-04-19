public class TryCatch2 {
    public static void main(String[] args)
    {
        int a = 10;
        int b = 5; 
        int c = 5;
        int x,y;
    
        try{
            x = a/(b-c);
            System.out.println(x+" it is the value of x");
        }
        catch(ArithmeticException e)
        {
            System.out.println("you are trying to divide with zero go and run it again");
        }
        y = a/(b+c);
        System.out.println(y+" it is the value of y");
    }
}
