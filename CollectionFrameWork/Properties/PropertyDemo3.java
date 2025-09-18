package CollectionFrameWork.Properties;

import java.util.Properties;
import java.io.FileOutputStream;
import java.io.IOException;


public class PropertyDemo3 {
    public static void main(String[] args){

        Properties p = new Properties();

        p.setProperty("Project Name", "Project X");
        p.setProperty("Version", "1.0.0");
        p.setProperty("Author", "Mr. X");
        p.setProperty("License", "MIT");
        p.setProperty("Repository", "TopSecret");

        try(FileOutputStream fos = new FileOutputStream("D://Practice Files//PropertyDemo3.txt")) {
            p.store(fos, "Project Details");
        }catch(IOException e){
            System.out.println("Error while saving the data into the file" + e.getMessage());
        }
    }
}
