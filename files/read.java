package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class read {
    public static void main(String[] args) {
        /* //BufferedReader + FileReader: Best for reading text files line-by-line
        // // FileInputStream: Best for binary files (e.g., image, audio file)
        // RandomAccessFile: Best for read/write specifc portions of a large file */ 

        String filePath = "files\\test.txt";

        

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath)))
        {
            System.out.println("That file exists");
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Could not locate file");
        }
        catch(IOException e)
        {
            System.out.println("Something went wrong");
        }
    }
}
