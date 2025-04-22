import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*In this we will learn how we can store the data into a file by their own datatypes instead of a common data type called string.

In the DataOutputStream class (it's constructor takes the object reference of fileOutputStream as input) have methods to store the data in their real form.
*/
class Student {
  int rollno;
  float avg;
  String name;
  String dept;
}

public class StoreTheValueByRealDatatype {
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos = new FileOutputStream("practice.txt");
        //it is the DataOutputStream oject creation
        DataOutputStream dos = new DataOutputStream(fos);

        //now create the object of the student.
        Student s = new Student();
        s.rollno = 1;
        s.avg = 80.5f;
        s.name = "Abhishek";
        s.dept = "cse";

        //now through following these methods you can write your data into the file as their own form of datatype

        dos.writeInt(s.rollno);
        dos.writeFloat(s.avg);
        dos.writeUTF(s.name);
        dos.writeUTF(s.dept);
        //the data now which will be present inside the practice.txt file you can not read because it is a binary file it is present in it's own form.

        
        dos.close();
        fos.close();
    }
}
