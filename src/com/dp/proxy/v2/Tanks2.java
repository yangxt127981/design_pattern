package com.dp.proxy.v2;


public class Tanks2 extends Tank{
	@Override
	public void move() {
		long start = System.currentTimeMillis();
		super.move();	
		long end = System.currentTimeMillis();
		System.out.println("total run time:"+(end-start));
	}
}
