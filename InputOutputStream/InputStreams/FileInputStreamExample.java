package InputOutputStream.InputStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample
{
    public static void main(String[] args)
    {
        try
        {
            try(FileInputStream fis1 = new FileInputStream("D:/Project/Udemy/AbdulBari/LearningPractices/InputOutputStream/resources/test1.txt");)
            {
                byte b2[] = new byte[fis1.available()];
               fis1.read(b2);

               String str = new String(b2);
                System.out.println("Data read from file: " + str);
            }
        }catch(FileNotFoundException e)
        {
            System.out.println(e);
        }catch(IOException e)
        {
            System.out.println(e);
        }
    }
}