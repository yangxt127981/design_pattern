package com.dp.factory;

public class App {
    public static void main(String[] args){
    	Car c = Car.getinstance();
    	Car c2 = Car.getinstance();
    	if (c == c2){
    		System.out.println("same car");
    	}
    	c.run();
    }
}
