package CollectionFrameWork.Properties;

import java.util.Properties;
import java.io.FileOutputStream;
import java.io.IOException;


public class PropertyDemo5 {
    public static void main(String[] args){

        Properties p = new Properties();

        p.setProperty("App Name", "ChatGPT");
        p.setProperty("Version", "4.0");
        p.setProperty("Developer", "OpenAI");
        p.setProperty("Release Year", "2023");
        p.setProperty("License", "Proprietary");
        p.setProperty("Platform", "Web");

        try(FileOutputStream fos = new FileOutputStream("D://Practice Files//PropertyDemo5.xml")){
            p.storeToXML(fos, "Application Details");
        }catch(IOException e){
            System.out.println("error while saving the data into the xml file" + e.getMessage());
        }


    }
}
