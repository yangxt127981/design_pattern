package com.observe.v3;

import java.io.IOException;
import java.util.Properties;

public class App {

	public static void main(String[] args) {
//		Dad d = new Dad();
//		Child c = new Child();
//		GrandFather gf = new GrandFather();
//		c.addWakenUpListener(d);
//		c.addWakenUpListener(gf);
//		new Thread(c).start();
		
		/*use properties file, extend improve greatly, add new listener, only need to add a new class and add class name in properties file*/
		Properties props = new Properties();
		try {
			props.load(App.class.getClassLoader().getResourceAsStream("com/observe/v3/observer.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] observers = props.getProperty("observers").split(",");
		//System.out.println(observers);
		Child c = new Child();
		for(int i=0; i<observers.length;i++){
			
			try {
				c.addWakenUpListener((WakenUpListener)(Class.forName(observers[i]).newInstance()));
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		new Thread(c).start();

	}
    
	
}
