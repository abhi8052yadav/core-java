
import java.io.ByteArrayInputStream;

public class ByteArrayReadAll {
    public static void main(String[] args) throws Exception {
        byte[] b = {'a','b','c'};

        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        // you can also read it through CharArrayReader class which is 
        // used to read characters in same way.
        
        String st = new String(bis.readAllBytes());
        System.out.println(st);
        bis.close();   
    }
}
