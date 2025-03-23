/*here the toString() method is very important to know all the values of the variables of any class make this method in the clas
 * and use it by calling its object reference name.
 */





import java.util.*;

public class Student {
    int roll_no;
    String name;
    int m1,m2,m3;
    public int totalMarks()
    {
        return m1+m2+m3;
    }
    public int averageMarks()
    {
        return totalMarks()/3;
    }
    public String grade()
    {
        if(totalMarks() >=70) return "A";
        else if(totalMarks() < 70) return "B";
        else if(totalMarks() >= 60) return "C";
        else if(totalMarks() < 60) return "D";
        else return "E";
    }
    public String toString()
    {
        return "name : "+name+"\nroll no. : "+roll_no+"\nm1 = "+m1+"\nm2 = "+m2+"\nm3 = "+m3;
    }
}
class StudentObject{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    
        Student s1 = new Student();
        System.out.println("enter the name of the Student : ");
        s1.name = sc.next();
        System.out.println("enter the roll no. of the student : ");
        s1.roll_no = sc.nextInt();
        System.out.println("enter the three subjects marks of the student : ");
        s1.m1 = sc.nextInt();
        s1.m2 = sc.nextInt();
        s1.m3 = sc.nextInt();
        System.out.println("the total marks of the "+s1.name+" is : "+s1.totalMarks());
        System.out.println("the average marks of the student is : "+s1.averageMarks());
        System.out.println("hence the student is passed the exam by "+s1.grade()+" grade");
        System.out.println("the details of the student is : "+s1);
        sc.close();
    }
}
