package InputOutputStream;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


class FileExample {
    public static void main(String[] args) {
        try{
        FileOutputStream fos = new FileOutputStream("D:/Project/Udemy/AbdulBari/LearningPractices/InputOutputStream/resources/CheckOutput1.txt");
        String str = "Hello, this is a test file to understand FileInputStream form I-O.";
        fos.write(str.getBytes());

        byte b[] = str.getBytes();
        fos.write(b,6,str.length()-6);
        fos.close();

        }

        catch(FileNotFoundException e)
        {
            System.out.println("File not found or unable to open the file.");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

    }
}
