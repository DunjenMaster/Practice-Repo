package InputOutputStream;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


class FileExample {
    public static void main(String[] args) {
        try{
        FileOutputStream fos = new FileOutputStream("D:/Project/PutYourOwnPathHereForPracctice/Output.txt");
        String str = "Hello, this is a test file to understand FileInputStream form I-O.";
        fos.write(str.getBytes());

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
