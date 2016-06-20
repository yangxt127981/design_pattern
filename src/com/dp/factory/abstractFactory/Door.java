package com.dp.factory.abstractFactory;

public class Door {
   private String type;
   public Door(String type){
	   this.type= type;
   }
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
   
	public void pringDoor(){
       System.out.println(this.type);
	}
}
