package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    static Properties po;
    static {  //in class static block will excetes, then initilizer, then others
        try {
            //fileinputstream object itself is checked exception
            FileInputStream file = new FileInputStream("config.properties");
            po = new Properties();

            po.load(file);

            file.close();

        } catch (Exception e) {

        }
    }
    public static String getinfo(String ss){
        return po.getProperty(ss);
    }



}


