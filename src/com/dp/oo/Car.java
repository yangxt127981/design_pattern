package com.dp.oo;

public class Car extends Vihecle{
  private String brand;

  public Car(String brand) {
		this.brand = brand;
	}
  
public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public void go(Address dest){
	System.out.println("gua dang");
	System.out.println("jia oil");
	System.out.println(this.brand+" go go go " + dest.getDestination());


}




}
