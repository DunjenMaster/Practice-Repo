package CollectionFrameWork.Properties;

import java.io.FileOutputStream;
import java.util.Properties;
import java.io.IOException;

public class PropertyDemo4 {
    public static void main(String[] args){

        Properties p = new Properties();

        p.setProperty("Database", "MySQL");
        p.setProperty("User", "admin");
        p.setProperty("Password", "password123");
        p.setProperty("Host", "localhost");
        p.setProperty("Port", "3306");
        p.setProperty("MaxConnections", "100");

        try(FileOutputStream fos = new FileOutputStream("D://Practice Files//PropertyDemo4.xml")){
            p.storeToXML(fos, "Database Configuration");
        }catch(IOException e){
            System.out.println("Error while saving the data into the file" + e.getMessage());
        }
    }
}
