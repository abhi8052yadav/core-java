
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*in this you will learn how store the whole object into the file.
 * 
 */

//to achieve the power to save the whole object into file we have to also use an interface called serializable into our student class show we can able to make it to save as an object in the file.

//the second rule is that the student class it should have a default constructor

// the third rule is that if any property in this class is static or transiant then you cannot use serializable and you can not make their object.

//hence if you want to make a class which is not serializable then make it static or transiant.
class Student implements Serializable{
    int rollno;
    String name;
    String dept;
    Student(){}
}
public class Serialization{
    public static void main(String[] args)throws Exception{
        FileOutputStream fos = new FileOutputStream("practice.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Student s = new Student();
        s.rollno =5;
        s.name = "ahishek";
        s.dept= "cse";
        oos.writeObject(s);
        oos.close();
        fos.close();
    }
}