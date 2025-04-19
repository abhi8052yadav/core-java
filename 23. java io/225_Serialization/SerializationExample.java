import java.io.FileOutputStream;
import java.io.PrintStream;

/*through serializtion is the concept of writing the data of the program or any object into file using printstream class object.
 * it writes the data in the file.
 * it takes the fileOutputStream object or for input inputstream. because our file first will be connected to the input or output stream then int will connect with the printstream.
 * now you can use as simple as you give or take output in terminal same to same you can take and give output to a file by using print stream.
 */

class Student{
    int rollno;
    String name;
    String dept;
}
public class SerializationExample{
    public static void main(String[] args)throws Exception
    {
        FileOutputStream fos = new FileOutputStream("practice.txt");

        PrintStream ps = new PrintStream(fos);
        
        Student s = new Student();
        s.rollno = 5;
        s.name = "Abhishek";
        s.dept = "CSE";

        //now to write in the file use println method.
        ps.println(s.rollno);
        ps.println(s.name);
        ps.println(s.dept);
        //it will store the data in the form of string.

        ps.close();
        fos.close();
    }
}