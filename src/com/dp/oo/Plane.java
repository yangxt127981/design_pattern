package com.dp.oo;

public class Plane extends Vihecle {
    private String name;
	public Plane(String name) {
	  this.name = name;
	}
    
	public void go(Address dest){
		System.out.println(this.name+" fly go go"+dest.getDestination());
	}
}
