import java.io.FileInputStream;

public class FileInputseekho {
    public static void main(String[] args) throws Exception
    {
        try (FileInputStream fis = new FileInputStream("new.txt"))
        {
            int x;
            do
            {
                x = fis.read();
                System.out.print((char)x);
            }while(x!=-1);
        }
    }
}
