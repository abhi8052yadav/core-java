
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

class Student{
    int rollno;
    String name;
    String dept;
    }
public class ReadingFromFile {
    public static void main(String[] args)throws Exception
    {
        FileInputStream fis = new FileInputStream("practice.txt");
        //to read one line overall we use bufferreader so it will read the whole line of the file.
        BufferedReader bf = new BufferedReader(new InputStreamReader(fis));

        
        Student s = new Student();
        //now read from the file and initialize in the student object 
        // here readLine() is present in the bufferreader class which read a line whole data and gives output a string value.
        s.rollno = Integer.parseInt(bf.readLine());
        // in this the pointer automatically point to the next line at a one runtime.
        s.name = bf.readLine();
        s.dept = bf.readLine();

        System.out.println("roll no."+s.rollno);
        System.out.println(s.name);
        System.out.println(s.dept);
        bf.close();
        fis.close();
    }

}
