package com.dp.factory.abstractFactory;

public class ModernFactory extends AbstractFactory{

	@Override
	public Door createDoor() {
		// TODO Auto-generated method stub
		return new SteelDoor();
	}

	@Override
	public Floor createFloor() {
		// TODO Auto-generated method stub
		return new WoodFloor();
	}

	@Override
	public Top createTop() {
		// TODO Auto-generated method stub
		return new GlassTop();
	}

}
