// Static Variables:
// Write a Java program to create a class called "Counter" with a static variable count. Implement a constructor that increments count every time an object is created. Print the value of count after creating several objects.

class CountExample{
    private static int count = 0;
    public CountExample()
    {
        count++;
        System.out.println(count);
    }
    public int getCount()
    {
        return count;
    }
}

public class Count{
    static public void main(String[] args)
    {
        CountExample s1 = new CountExample();
        s1.getCount();
        CountExample s2 = new CountExample();
        s2.getCount();
        CountExample s3 = new CountExample();
        s3.getCount();
        CountExample s4 = new CountExample();
        s4.getCount();
    }
}