package org.clay.calllog.consumer;

import java.io.InputStream;
import java.util.Properties;

/**
 *  工具类
 */
public class PropertiesUtil {
    public static Properties props ;
    static{
        try {
            //加载外部属性文件
            InputStream in = ClassLoader.getSystemResourceAsStream("kafka.properties");
            props = new Properties();
            props.load(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static String getProp(String key){
        return props.getProperty(key) ;
    }

    public static String getString(String key){
        return props.getProperty(key) ;
    }

    public static int getInt(String key){
        return Integer.parseInt(props.getProperty(key)) ;
    }
}
