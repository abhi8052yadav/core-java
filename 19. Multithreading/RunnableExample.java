class A implements Runnable{
    @Override
    public void run()
    {
        while (true) { 
            System.out.println("hello : i am runnable interface");
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        A a = new A();
        Thread t = new Thread(a);
        t.start();
    }
}
