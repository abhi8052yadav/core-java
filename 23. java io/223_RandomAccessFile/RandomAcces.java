import java.io.RandomAccessFile;

public class RandomAcces{
    public static void main(String[] args) throws Exception
    {
        RandomAccessFile rf = new RandomAccessFile("practice.txt","rw");

        System.out.println((char) rf.read());
         
    }
}