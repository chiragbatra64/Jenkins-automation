package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	private static Properties properties = new Properties();
	
	static {
		try {
			String basePath = System.getProperty("user.dir");
			File file = new File(basePath + File.separator + "config.properties");
			
			if(file.exists()) {
				FileInputStream fis = new FileInputStream(file);
				properties.load(fis);				
			}else {
				InputStream is = ConfigReader.class
	                    .getClassLoader()
	                    .getResourceAsStream("config.properties");

	            if (is == null) {
	                throw new RuntimeException("config.properties not found in classpath");
	            }
	            properties.load(is);
			}
		} catch (Exception e) {
			throw new RuntimeException("Unable to load config.properties");
		}
	}
	
	public static String get(String key) {
		if (System.getProperty(key) != null) {
			return System.getProperty(key);
		}
		return properties.getProperty(key);
	}
	
    public static int getInt(String key) {
        return Integer.parseInt(get(key));
    }

    public static boolean getBoolean(String key) {
        return Boolean.parseBoolean(get(key));
    }
}
