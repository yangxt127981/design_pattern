package com.dp.factory.abstractFactory;

public class ChinaFactory extends AbstractFactory{
  public Door createDoor(){
	  return new WoodDoor();
  }
  
  public Floor createFloor(){
	  return new WoodFloor();
  }
  
  public Top createTop(){
	  return new WoodTop();
  }
}
