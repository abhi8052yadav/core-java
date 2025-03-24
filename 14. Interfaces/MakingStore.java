interface Member{
    public void callback();
}
class Customer implements Member{
    String name;
    Customer(String name)
    {
        this.name = name;
    }
    @Override
    public void callback(){
        System.out.println(name+" ok , i will to buy.");
    }
}
class Store{
    Member member[] = new Member[100];
    int count = 0;
    void register(Member m)
    {
        member[count++] = m;
    }
    void inviteOffer()
    {
        for(int i=0; i<count; i++)
        {
            member[i].callback();
        }
    }
}

public class MakingStore{
    public static void main(String[] args)
    {
        Store s = new Store();
        Customer c1 = new Customer("Abhishek");
        Customer c2 = new Customer("Rupant");
        s.register(c1);
        s.register(c2);
        s.inviteOffer();
    }
}