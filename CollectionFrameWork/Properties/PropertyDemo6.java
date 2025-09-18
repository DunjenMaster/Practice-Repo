package CollectionFrameWork.Properties;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class PropertyDemo6 {
    public static void main(String[] args){

        Properties p = new Properties();
        System.out.println(p.getProperty("Database"));

        try(FileInputStream fis = new FileInputStream("D://Practice Files//PropertyDemo4.xml")){
            p.loadFromXML(fis);
            System.out.println(p);
        }catch(IOException e){
            System.out.println("Error while loading the data from the file" + e.getMessage());
        }
    }
}
