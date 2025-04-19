public class Cline {
    public static void main(String[] args)
    {
        int invalid = 0;
        int number, count =0;
        for(int i=0; i<args.length; i++)
        {
            try{
                number = Integer.parseInt(args[i]);
            }
            catch(NumberFormatException e){
                invalid = invalid + 1;
                System.out.println("invalid number : "+args[i]);
                continue;
            }
            count = count+1;
        }
        System.out.println("the total no. of invalid numbers are :"+ invalid);
        System.out.println("the total no. of valid numbers are : "+count);
    }
}
