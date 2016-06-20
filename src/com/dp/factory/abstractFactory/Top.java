package com.dp.factory.abstractFactory;

public class Top {
	private String type;
	
	public Top(String type){
		this.type= type;
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
   
	public void pringTop(){
	       System.out.println(this.type);
	}
}
