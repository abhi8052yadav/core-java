class AtmMachine{
    synchronized public void checkBalance(String name)
    {
        System.out.println(name+" is checking the balance.");
        try{
            Thread.sleep(500);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    synchronized public void withdrawing(String name)
    {
        System.out.println(name+"is withdrawing the money.");
        try{
            Thread.sleep(500);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class Customer extends Thread{
    AtmMachine a;
    String name;
    Customer(AtmMachine a,String name)
    {
        this.name = name;
        this.a = a;
    }
    public void useAtm()
    {
        a.checkBalance(name);
        a.withdrawing(name);
    }
    @Override
    public void run()
    {
        useAtm();
    }
}


public class ATM {
    public static void main(String[] args) {
        AtmMachine e = new AtmMachine();
    Customer c1 = new Customer(e,"abhishek");
    Customer c2 = new Customer(e, "rupant");
    c1.start();
    c2.start();
    }
}
