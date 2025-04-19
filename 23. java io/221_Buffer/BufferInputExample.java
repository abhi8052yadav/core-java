import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferInputExample{
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis = new FileInputStream("theory.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        int x ;
        while((x = bis.read()) != -1)
        {
            System.out.print((char)x);
        }

        bis.close();
        fis.close();
    }
}