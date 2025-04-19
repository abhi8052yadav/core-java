class Commonfor{
    synchronized public void display(String st)
    {
        for(int i=0; i<st.length(); i++)
        {
            System.out.print(st.charAt(i));
        }
    }
}
class Mythread1 extends Thread{
    Commonfor d;
    Mythread1(Commonfor d)
    {
        this.d = d;
    }
    @Override
    public void run()
    {
        d.display("Hello World");
    }
}

class Mythread2 extends Thread{
    Commonfor data;
    Mythread2(Commonfor data)
    {
        this.data = data;
    }
    @Override
    public void run()
    {
        data.display("welcome");
    }
}

public class SynchronizationExample {
    public static void main(String[] args)
    {
        Commonfor d = new Commonfor();
        Mythread1 t1 = new Mythread1(d);
        Mythread2 t2 = new Mythread2(d);
        t1.start();
        t2.start();
    }
}
