package com.dp.oo;

public class Driver {
   private String name;
   
   public String getName() {
	return name;

	}
	public void setName(String name) {
		this.name = name;
	}
	public Driver(String name){
	   this.name = name; 
   }
   public void drive(Car c){
      c.go(new Address("shanghai")); // hidden and encapsulate
   }
   
   public void drive(Car c,Address dest){
      c.go(dest); // hidden and encapsulate
   }
   
   /*
    * if don't use polymophim, add a new vihecle, need to add new method for it
    * public void drive(Plane c,Address dest){
      c.go(dest); // hidden and encapsulate
   }
    */
   public void drive(Vihecle c,Address dest){
      c.go(dest); // hidden and encapsulate
   }
}
