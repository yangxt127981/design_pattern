package com.dp.factory.simpleFactory;

public class PlaneFactory extends VehicleFactory{
   
	@Override
	public Moveable create() {
		// TODO Auto-generated method stub
		   return new Plane();
	}
}
