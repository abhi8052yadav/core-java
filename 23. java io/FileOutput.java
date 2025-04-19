
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutput{
    public static void main(String[] args) {

        // here it is used to create a new text file inside the given 
        // to the object. it can through an exception so use handle the 
        // exception
        try
        {

            FileOutputStream fos = new FileOutputStream("new.txt");
            String str = "learn java programming";

            fos.write(str.getBytes());
            fos.write(str.getBytes(),5,str.length()-5);
            fos.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.err.println(e);
        }
    }
}