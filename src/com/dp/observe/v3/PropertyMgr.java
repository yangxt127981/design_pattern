package com.dp.observe.v3;

import java.io.IOException;
import java.util.Properties;
/*save file into cache memory, load file from memory cache instead of hard disk. 
 * if change file, memory cache not refresh automatically singleton*/
public class PropertyMgr {
	private static Properties props = new Properties();
    static{
	   try {
			props.load(App.class.getClassLoader().getResourceAsStream("com/dp/observe/v3/observer.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
     public static String getProperty(String key){
		
	     return props.getProperty(key);
     }
}
