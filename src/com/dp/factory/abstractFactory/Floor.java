package com.dp.factory.abstractFactory;

public class Floor {
	private String type;

	public Floor(String type){
		   this.type= type;
	}
	   
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public void pringFloor(){
	       System.out.println(this.type);
   }
}
