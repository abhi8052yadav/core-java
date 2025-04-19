import java.io.ByteArrayInputStream;

public class ByteArrayInput{
    public static void main(String[] args) throws Exception {
        byte b[] = {'a','b','c'};

        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        
        int x;
        while ((x = bis.read()) != -1) {
            System.out.println((char)x);
        }

        bis.close();
    }
}