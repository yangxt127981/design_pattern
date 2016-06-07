package com.dp.oo;

public class Test {

	public static void main(String[] args) {
           Driver d = new Driver("zhang");
           Vihecle v = new Car("BMW");
           //Vihecle v = new Plane("Bowin");

           d.drive(v,new Address("shang hai"));
	}

}
