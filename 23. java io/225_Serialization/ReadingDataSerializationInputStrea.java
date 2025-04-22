
import java.io.DataInputStream;
import java.io.FileInputStream;

class Student{
    int rollno;
    float avg;
    String name;
    String dept;
}
public class ReadingDataSerializationInputStrea {

    public static void main(String[] args)throws Exception
    {
        FileInputStream fis = new FileInputStream("practice.txt");
        DataInputStream dis = new DataInputStream(fis);
        Student s = new Student();

        //through these methods of datainputstream you can take values in their original form 
        
        //order should be shame as the data is written in the practice.txt 
        //if the order is changes then data also be changed
        s.rollno = dis.readInt();
        s.avg = dis.readFloat();
        s.name = dis.readUTF();
        s.dept = dis.readUTF();
        System.out.println(s.rollno);
        System.out.println(s.avg);
        System.out.println(s.name);
        System.out.println(s.dept);

        dis.close();
        fis.close();
    }
}
