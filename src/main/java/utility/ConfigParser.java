package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigParser {
    public static Object fetchProperity(String key) throws IOException {
        String path = "config/configuration.properties";
        FileInputStream fis = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fis);
        return properties.getProperty(key);
    }
}
