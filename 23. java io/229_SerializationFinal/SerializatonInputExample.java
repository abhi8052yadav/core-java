
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Student implements Serializable{
    int rollno;
    String name;
    String dept;
    Student (){}
    Student(int rollno,String name,String dept)
    {
        this.rollno = rollno;
        this.name = name;
        this.dept = dept;
    }
}

public class SerializatonInputExample {
    public static void main(String[] args)throws Exception
    {
        FileInputStream fis = new FileInputStream("practice.txt");
        ObjectInputStream oos = new ObjectInputStream(fis);
        
        Student s = (Student)oos.readObject();
        System.out.println(s);

        fis.close();
        oos.close();
    }
}
