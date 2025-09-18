package CollectionFrameWork.Properties;

import java.util.Properties;
import java.io.FileOutputStream;
import java.io.IOException;

public class PropertyDemo {
    public static void main(String[] args){

        Properties p = new Properties();

        p.setProperty("Vehicle Type:", "Car");
        p.setProperty("Brand", "Mustang");
        p.setProperty("Model", "GT");
        p.setProperty("Year", "1967");

        System.out.println(p);

        try(FileOutputStream fos = new FileOutputStream("D://Practice Files//PropertyDemo.txt")){
            p.store(fos, "Vehicle Details");
        }catch (IOException e){
            System.out.println("Error Saving the Property File" + e.getMessage());
        }
    }
}
