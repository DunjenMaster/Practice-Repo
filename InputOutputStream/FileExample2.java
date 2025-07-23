package InputOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample2
{
    public static void main(String[] args)
    {
        String str = "Hello, this is a test file to understand FileInputStream form I-O And this is created with try with resources!";
        byte[] b = str.getBytes();

        try (FileOutputStream fos = new FileOutputStream("D:/Project/Udemy/AbdulBari/LearningPractices/InputOutputStream/resources/Output2.txt")) {
            fos.write(str.getBytes());
            fos.write(b, 6, str.length() - 6);
        } catch (FileNotFoundException e) {
            System.out.println("File not found or unable to open the file.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}