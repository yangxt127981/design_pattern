package com.dp.factory.simpleFactory;

public class CarFactory extends VehicleFactory{
	 
	@Override
	public Moveable create() {
		// TODO Auto-generated method stub
		   return new Car();
	}
}
