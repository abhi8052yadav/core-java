public class Practice{
    static class A extends Thread{
       @Override
       public void run()
       {
        int i=1;
        while(i<10)
        {
            System.out.println(i+"from A");
        }
       }
    }
    static class B extends Thread{
        @Override
        public void run()
        {
            int i=2;
            while(i<5)
            {
                System.out.println(i+10);
                i++;
            }
        }
    }
    public static void main(String[] args)
    {
        A a1 = new A();
        a1.start();
        B b1 = new B();
        b1.start();
        System.out.println("main method is called a and b");
    }
}