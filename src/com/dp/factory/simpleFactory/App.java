package com.dp.factory.simpleFactory;

public class App {
    public static void main(String[] args){
    	//Moveable m = new Car();
    	//Moveable m = new Plane();
    	VehicleFactory factory = new PlaneFactory();
    	Moveable m = factory.create();
    	m.run();
    }
}
