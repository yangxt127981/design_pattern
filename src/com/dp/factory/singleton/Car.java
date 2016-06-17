package com.dp.factory.singleton;

import java.util.ArrayList;
import java.util.List;

public class Car {
   /*use singleton to new instance*/
	private static Car car = new Car();
	/*connection Pool*/
	//private static List<Car> cars = new ArrayList<Car>();

	private Car(){
		
	}
	
	public static Car getinstance(){
		return car;
	}
	
	public void run(){
	   System.out.print("run use wheel");
   }
}
