package com.zy.util;

import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {

    /**
     * ªÒ»°value
     *
     * @param key
     * @return
     */
    public String getValue(String key) throws Exception{
        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("filepath.properties");
        Properties properties = new Properties();
        properties.load(resourceAsStream);
        String value = (String) properties.get(key);
        return value;
    }
}
