package com.dp.factory.abstractFactory;

public class App {

	public static void main(String[] args) {

		/*change to another style, need to change all code. don't have extensibility*/
//		WoodDoor wd = new WoodDoor();
//		wd.pringWoodDoor();
//		WoodFloor wf = new WoodFloor();
//		wf.printWoodFloor();
//		WoodTop wt = new WoodTop();
//		wt.printWoodTop();
		
		/*use factory to control create instance*/
//		ChinaFactory df = new ChinaFactory();
//		df.createWoodDoor().pringWoodDoor();
//		df.createWoodFloor().printWoodFloor();
//		df.createWoodTop().printWoodTop();
		
		
		/*use simple factory, so many factory*/
//		DoorFactory df = new woodDoorFactory();
//		FloorFactory ff = new woodFloorFactory();
//		TopFactory tf = new woodTopFactory();
//        df.createWoodDoor().pringDoor();
//        ff.createWoodFloor().printWoodFloor();
//		df.createWoodTop().printWoodTop();
		
		
		/*use abstract factory to implement extensibility, only need change factory type*/
		AbstractFactory af = new ModernFactory();
		af.createDoor().pringDoor();
		af.createFloor().pringFloor();
		af.createTop().pringTop();
		
	}

}
