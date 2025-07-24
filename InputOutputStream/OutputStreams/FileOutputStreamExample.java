package InputOutputStream.OutputStreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample
{
    public static void main(String[] args)
    {
        try
        {

            FileOutputStream fos1 = new FileOutputStream("D:/Project/Udemy/AbdulBari/LearningPractices/InputOutputStream/resources/test1.txt");

            String str = "Learn Java Programming!";

            fos1.write(str.getBytes());
            fos1.close();

        }

        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
