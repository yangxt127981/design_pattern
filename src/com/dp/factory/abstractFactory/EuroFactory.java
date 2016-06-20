package com.dp.factory.abstractFactory;

public class EuroFactory extends AbstractFactory{

	@Override
	public Door createDoor() {
		// TODO Auto-generated method stub
		return new GlassDoor();
	}

	@Override
	public Floor createFloor() {
		// TODO Auto-generated method stub
		return new GlassFloor();
	}

	@Override
	public Top createTop() {
		// TODO Auto-generated method stub
		return new GlassTop();
	}

}
