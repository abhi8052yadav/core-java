class Even extends Thread {
    @Override
    public void run()
    {
       int i=2;
       while(i<20)
       {
        System.out.print(i+" ");
        i += 2;
       }
    }
    
}
class Odd extends Thread{
    @Override
    public void run()
    {
        int i=1;
        while(i<20)
        {
            System.out.print(i+" ");
            i += 2;
        }
    }
}

public class EvenOdd{
    public static void main(String[] args)
    {
       Even e = new Even();
       Odd o = new Odd();
       e.setPriority(Thread.MAX_PRIORITY);
       o.setPriority(Thread.MIN_PRIORITY);
       e.start();
       o.start();
    }
}