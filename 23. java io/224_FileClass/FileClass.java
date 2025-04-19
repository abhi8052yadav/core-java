//in this you will learn about file class about the methods which are present in it.

import java.io.File;

public class FileClass{
    public static void main(String[] args) throws Exception
    {
        //in this you have to give the full path of any folder or file.
        File f = new File("justafilepath");
        
        // f.isDirectory method will tell you is it a directory or not.
        System.out.println(f.isDirectory());//output true
        //if the output is true then you can check all the files listed inside that directory
        //by f.list() you will all the files in a string array 
        String list[] = f.list();
        for(String x:list)
        {
            System.out.println(x);
        }

        // now you can take an array of file also instead of getting a string array.

        // File[] list = f.listFiles();

        // for(File f1 : list)
        // {
        //     //now it is a file hence to get the name of the file use getName() method
        //     System.out.println(f1.getName()+" ");
        //     //now through getPath() method you can get the path of the file also
        //     System.out.println(f1.getPath());
        // }
    }
}