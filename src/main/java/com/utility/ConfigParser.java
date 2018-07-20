package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigParser {

    public static Object fetchProperity(String key){
        try {
            FileInputStream fis = new FileInputStream(new File("config/configuration.properties"));
            Properties properties = new Properties();
            properties.load(fis);
            return properties.getProperty(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;


    }
}
