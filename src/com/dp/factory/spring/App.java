package com.dp.factory.spring;




public class App {
    public static void main(String[] args){
    	/* you don;t need to new car, write it in configuration file*/
//    	Properties pros = new Properties();
//    	try {
//			pros.load(App.class.getClassLoader().getResourceAsStream("com/dp/factory/spring/spring.properities"));
//			String vehicleTypeName = pros.getProperty("VehicleType");
//	    	Moveable m  = (Moveable)(Class.forName(vehicleTypeName).newInstance());
//	    	m.run();
//    	} catch (Exception e) {
//			e.printStackTrace();
//		}
	    try {
			BeanFactory f = new ClasspathXmlApplicationContext("com/dp/factory/spring/applicationContext.xml");
		    Object o = f.getBean("v");
		    Moveable m = (Moveable)o;
		    m.run();
	    } catch (Exception e) {
			e.printStackTrace();
		}
    }
}
