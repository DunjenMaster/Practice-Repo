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

            //Writing String to file using FileOutputStream byte by byte using offset !
            byte b [] = str.getBytes();

            fos1.write(b, 6, str.length() - 6); // Write from index 6 to the end of the string
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
