public class ArrayClass {
    private int roll_no;
    private String name;
    public ArrayClass(int roll_no,String name){
        this.roll_no = roll_no;
        this.name = name;
    }

    public int rollnumber()
    {
        return roll_no;
    }
    public String name(){
        return name;
    }
}
class Ma{
    public static void main(String[] args)
    {
        ArrayClass s[] = new ArrayClass[3];
        s[0] = new ArrayClass(1,"abhishek");
        s[1] = new ArrayClass(2, "abhishek2");
        s[2] = new ArrayClass(3, "abhishek3");
        System.out.println(s[0].rollnumber());
    }
}