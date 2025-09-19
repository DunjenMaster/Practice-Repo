package CollectionFrameWork.Properties;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.IOException;

public class PropertyDemo7 {
    public static void main(String[] args){
        Properties p = new Properties();
        // To load the content of text file!
        try(FileInputStream fis = new FileInputStream("D://Practice Files//PropertyDemo3.txt")){
            p.load(fis);
            System.out.println(p);
            System.out.println(p.getProperty("Repository"));
        }catch(IOException e){
            System.out.println("Error while loading the file content" + e.getMessage());
        }
    }
}
