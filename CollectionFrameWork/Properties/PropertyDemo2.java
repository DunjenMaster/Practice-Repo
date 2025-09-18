package CollectionFrameWork.Properties;

import java.util.Properties;
import java.io.FileOutputStream;
import java.io.IOException;

public class PropertyDemo2 {
    public static void main(String[] args){

        Properties p = new Properties();

        p.setProperty("Name", "Jhon Doe");
        p.setProperty("Occupation", "Software Developer");
        p.setProperty("Location", "New York");
        p.setProperty("Experience", "5 Years");

        try(FileOutputStream fos = new FileOutputStream("D://Practice Files//PropertyDemo2.txt")){
            p.store(fos, "Personal Details");
        }catch (IOException e){
            System.out.println("Error while saving the data in to the file" + e.getMessage());
        }

    }
}
